package io.github.yxr1024.chinesechess.play.ws.servermsg;

import io.github.yxr1024.chinesechess.ws.ServerMessage;

public class GameContinueServerMsg extends ServerMessage {
    public GameContinueServerMsg() {
        super("play.game_continue");
    }
}
