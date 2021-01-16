package io.github.yxr1024.chinesechess.user.ws;

import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class UserLoginServerMsg extends ServerMessage {

    public UserLoginServerMsg(int code) {
        super("user.login");
        this.code = code;
    }
}
