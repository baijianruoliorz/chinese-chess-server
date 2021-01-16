package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType("play.confirm_request")
public class ConfirmRequestMsg extends ClientMessage {
    private int reqType;
}
