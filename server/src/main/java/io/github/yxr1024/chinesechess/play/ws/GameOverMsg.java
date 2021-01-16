package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;


@Data
@ClientMsgType("play.game_over")
public class GameOverMsg extends ClientMessage {
    /**
     * 为空表示平局
     */
    private Long winUserId;
}
