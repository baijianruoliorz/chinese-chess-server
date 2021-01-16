package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.play.rule.ChessPos;
import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType("play.chess_move")
public class ChessMoveMsg extends ClientMessage {
    /**
     * 1=移动，2=吃子
     */
    private int moveType;
    private ChessPos fromPos;
    private ChessPos toPos;
}
