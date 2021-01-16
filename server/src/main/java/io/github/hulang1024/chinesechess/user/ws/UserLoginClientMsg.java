package io.github.hulang1024.chinesechess.user.ws;

import io.github.hulang1024.chinesechess.user.User;
import io.github.hulang1024.chinesechess.ws.ClientMessage;
import io.github.hulang1024.chinesechess.ws.ClientMsgType;
import lombok.Data;
import org.yeauty.pojo.Session;

@Data
@ClientMsgType(value = "user.login", guest = true)
public class UserLoginClientMsg extends ClientMessage {
    private Session session;
    private String token;
    private long userId;

    @Override
    public User getUser() {
        // 登录时不能获得用户，应根据userId获取
        throw new RuntimeException("无法获得用户");
    }
}
