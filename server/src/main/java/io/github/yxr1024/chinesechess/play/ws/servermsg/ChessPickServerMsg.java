package io.github.yxr1024.chinesechess.play.ws.servermsg;

import io.github.yxr1024.chinesechess.play.rule.ChessPos;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class ChessPickServerMsg extends ServerMessage {
    private int chessHost;
    private ChessPos pos;
    private boolean pickup;

    public ChessPickServerMsg() {
        super("play.chess_pick");
    }
}
