package io.github.yxr1024.chinesechess.play.rule;

import lombok.Data;

@Data
public class ChessPos {
    public int row;
    public int col;

    public ChessPos(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
