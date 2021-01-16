package io.github.yxr1024.chinesechess.room.ws;

import io.github.yxr1024.chinesechess.ws.ServerMessage;
import io.github.yxr1024.chinesechess.room.Room;
import lombok.Data;

@Data
public class LobbyRoomRemoveServerMsg extends ServerMessage {
    private long roomId;

    public LobbyRoomRemoveServerMsg(Room room) {
        super("lobby.room_remove");
        this.roomId = room.getId();
    }
}
