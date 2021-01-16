package io.github.yxr1024.chinesechess.spectator.ws;

import io.github.yxr1024.chinesechess.user.User;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class SpectatorJoinServerMsg extends ServerMessage {
    private User user;
    private int spectatorCount;

    public SpectatorJoinServerMsg() {
        super("spectator.join");
    }
}
