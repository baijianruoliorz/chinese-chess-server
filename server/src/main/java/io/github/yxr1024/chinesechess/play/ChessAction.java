package io.github.yxr1024.chinesechess.play;

import io.github.yxr1024.chinesechess.play.rule.Chess;
import io.github.yxr1024.chinesechess.play.rule.ChessEnum;
import io.github.yxr1024.chinesechess.play.rule.ChessHost;
import io.github.yxr1024.chinesechess.play.rule.ChessPos;
import lombok.Data;

@Data
public class ChessAction {
    private ChessHost chessHost;
    private ChessEnum chessType;
    private ChessPos fromPos;
    private ChessPos toPos;
    private Chess eatenChess;
}
