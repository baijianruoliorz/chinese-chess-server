package io.github.yxr1024.chinesechess.play.ws.servermsg;

import io.github.yxr1024.chinesechess.play.GamePlayStatesResponse;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class GamePlayStatesServerMsg extends ServerMessage {
    private GamePlayStatesResponse states;

    public GamePlayStatesServerMsg() {
        super("play.game_states");
    }
}
