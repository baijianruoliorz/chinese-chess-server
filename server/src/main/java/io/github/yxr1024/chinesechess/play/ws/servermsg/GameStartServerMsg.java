package io.github.yxr1024.chinesechess.play.ws.servermsg;

import io.github.yxr1024.chinesechess.user.User;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

/**
 * 棋局开始
 * @author HuLang
 */
@Data
public class GameStartServerMsg extends ServerMessage {
    private long redChessUid;
    private long blackChessUid;

    public GameStartServerMsg(User redChessUser, User blackChessUser) {
      super("play.game_start");
      this.redChessUid = redChessUser.getId();
      this.blackChessUid = blackChessUser.getId();
    }
}
