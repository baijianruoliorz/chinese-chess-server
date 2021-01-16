package io.github.yxr1024.chinesechess.chat.command.executors;

import io.github.yxr1024.chinesechess.chat.Channel;
import io.github.yxr1024.chinesechess.chat.ChannelManager;
import io.github.yxr1024.chinesechess.chat.InfoMessage;
import io.github.yxr1024.chinesechess.chat.Message;
import io.github.yxr1024.chinesechess.chat.command.CommandExecutor;
import io.github.yxr1024.chinesechess.user.User;
import io.github.yxr1024.chinesechess.user.UserManager;
import io.github.yxr1024.chinesechess.user.UserSessionManager;
import io.github.yxr1024.chinesechess.utils.RegExStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yeauty.pojo.Session;

@Component
public class LogoutCommandExecutor implements CommandExecutor {
    @Autowired
    private ChannelManager channelManager;
    @Autowired
    private UserManager userManager;
    @Autowired
    private UserSessionManager userSessionManager;

    @Override
    public void execute(String[] cmdParams, Message message, Channel channel) {
        if (!message.getSender().isAdmin()) {
            return;
        }

        if (!(cmdParams.length == 1 && cmdParams[0].matches(RegExStrings.USER_ID))) {
            return;
        }

        Long userId = Long.parseLong(cmdParams[0]);
        User user = userManager.getLoggedInUser(userId);
        if (user == null) {
            channelManager.sendSystemMessageToUser(
                new InfoMessage(String.format("%s 未登录",
                    user != null ? user.getNickname() : user.getId()), channel),
                message.getSender());
            return;
        }

        Session session = userSessionManager.getSession(user);
        if (session != null) {
            session.close();
        }
        userManager.logout(user, true);
        channelManager.sendSystemMessageToUser(
            new InfoMessage(String.format("%s 已被注销登录", user.getNickname()), channel),
            message.getSender());
    }
}