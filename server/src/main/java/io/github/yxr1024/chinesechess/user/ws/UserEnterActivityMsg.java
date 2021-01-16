package io.github.yxr1024.chinesechess.user.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType(value = "user_activity.enter", guest = true)
public class UserEnterActivityMsg extends ClientMessage {
    private int code;
}
