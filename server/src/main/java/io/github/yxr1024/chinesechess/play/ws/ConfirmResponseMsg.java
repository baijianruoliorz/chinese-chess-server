package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType("play.confirm_response")
public class ConfirmResponseMsg extends ClientMessage {
    private int reqType;
    private boolean ok;
}
