package io.github.yxr1024.chinesechess.room.ws;

import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class RoomUserLeftServerMsg extends ServerMessage {
    private long uid;
    
    public RoomUserLeftServerMsg() {
        super("room.user_left");
    }
}
