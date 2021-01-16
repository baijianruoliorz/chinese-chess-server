package io.github.yxr1024.chinesechess.task;

import io.github.yxr1024.chinesechess.chat.Channel;
import io.github.yxr1024.chinesechess.chat.ChannelManager;
import io.github.yxr1024.chinesechess.chat.Message;
import io.github.yxr1024.chinesechess.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ChannelTask {
    @Autowired
    private ChannelManager channelManager;

    /**
     * 每日晚上0点清理默认频道里发送时间为上日的聊天消息
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void clearExpiredMessages() {
        final long expiresAt = TimeUtils.toTimestamp(LocalDateTime.now()
            .withMinute(0).withSecond(0).withNano(0));

        for (long channelId : ChannelManager.defaultChannelIds) {
            Channel channel = channelManager.getChannelById(channelId);

            List<Message> expiredMessages = new ArrayList<>();
            channel.getMessages().forEach(message -> {
                if (message.getTimestamp() < expiresAt) {
                    expiredMessages.add(message);
                }
            });

            if (!expiredMessages.isEmpty()) {
                channel.removeMessages(expiredMessages);
            }
        }
    }
}
