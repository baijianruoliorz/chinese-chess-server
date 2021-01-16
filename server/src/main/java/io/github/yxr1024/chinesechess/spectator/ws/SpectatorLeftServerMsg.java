package io.github.yxr1024.chinesechess.spectator.ws;

import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class SpectatorLeftServerMsg extends ServerMessage {
    private long uid;
    private int spectatorCount;

    public SpectatorLeftServerMsg() {
        super("spectator.left");
    }
}
