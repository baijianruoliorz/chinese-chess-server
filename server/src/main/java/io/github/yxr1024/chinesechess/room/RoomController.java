package io.github.yxr1024.chinesechess.room;

import io.github.yxr1024.chinesechess.http.GuestAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Collection;

@RestController
@RequestMapping("/rooms")
@Validated
public class RoomController {
    @Autowired
    private RoomManager roomManager;
    @Autowired
    private QuickStartService quickStartService;

    /**
     * 查询房间
     * @return
     */
    @GuestAPI
    @GetMapping
    public ResponseEntity<Collection<Room>> getRooms(SearchRoomParam param) {
        return ResponseEntity.ok(roomManager.searchRooms(param));
    }

    /**
     * 查询指定房间
     * @param id
     * @return
     */
    @GetMapping("/{room_id}")
    public ResponseEntity<Room> getRoom(@NotNull @PathVariable("room_id") Long id) {
        return ResponseEntity.ok(roomManager.getRoom(id));
    }

    @PostMapping
    public ResponseEntity<Room> create(@Validated @RequestBody CreateRoomParam createRoomParam) {
        Room createdRoom = roomManager.createRoom(createRoomParam);
        if (createdRoom == null) {
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }

        return new ResponseEntity(createdRoom, HttpStatus.CREATED);
    }

    @PutMapping("/{room_id}")
    public ResponseEntity<Void> update(
        @NotNull @PathVariable("room_id") Long roomId,
        @Validated @RequestBody UpdateRoomParam param) {
        boolean ok = roomManager.updateRoomInfo(roomId, param);
        return new ResponseEntity(ok ? HttpStatus.OK : HttpStatus.EXPECTATION_FAILED);
    }

    @PutMapping("/{room_id}/users/{user_id}")
    public ResponseEntity<JoinRoomResult> join(
        @NotNull @PathVariable("room_id") Long roomId,
        @NotNull @PathVariable("user_id") Long userId,
        @RequestBody JoinRoomParam param) {
        JoinRoomResult result = roomManager.joinRoom(roomId, userId, param);
        return new ResponseEntity(result, result.isOk() ? HttpStatus.OK : HttpStatus.EXPECTATION_FAILED);
    }

    @DeleteMapping("/{room_id}/users/{user_id}")
    public ResponseEntity<Void> part(
        @NotNull @PathVariable("room_id") Long roomId,
        @NotNull @PathVariable("user_id") Long userId) {
        int ret = roomManager.partRoom(roomId, userId);
        return new ResponseEntity(ret == 0 ? HttpStatus.OK : HttpStatus.EXPECTATION_FAILED);
    }


    @PostMapping("/quick_start")
    public ResponseEntity<Room> quickStart() {
        Room room = quickStartService.quickStart();
        return new ResponseEntity(room, room != null ? HttpStatus.OK : HttpStatus.EXPECTATION_FAILED);
    }
}
