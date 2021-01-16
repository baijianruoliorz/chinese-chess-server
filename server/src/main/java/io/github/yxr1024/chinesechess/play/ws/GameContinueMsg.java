package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType("play.game_continue")
public class GameContinueMsg extends ClientMessage {
    private boolean ok;
}
