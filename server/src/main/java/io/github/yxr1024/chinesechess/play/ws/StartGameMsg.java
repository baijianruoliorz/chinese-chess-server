package io.github.yxr1024.chinesechess.play.ws;

import io.github.yxr1024.chinesechess.ws.ClientMessage;
import io.github.yxr1024.chinesechess.ws.ClientMsgType;
import lombok.Data;

@Data
@ClientMsgType("play.start_game")
public class StartGameMsg extends ClientMessage {
}
