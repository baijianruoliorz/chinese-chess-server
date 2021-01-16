package io.github.yxr1024.chinesechess.user.ws;

import io.github.yxr1024.chinesechess.user.User;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class UserOnlineServerMsg extends ServerMessage {
    private long uid;
    private String nickname;

    public UserOnlineServerMsg(User user) {
        super("user.online");
        this.uid = user.getId();
        this.nickname = user.getNickname();
    }
}
