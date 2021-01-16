package io.github.yxr1024.chinesechess.chat.ws;

import io.github.yxr1024.chinesechess.chat.Channel;
import io.github.yxr1024.chinesechess.chat.Message;
import io.github.yxr1024.chinesechess.user.User;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

import java.util.List;


@Data
public class ChatUpdatesServerMsg extends ServerMessage {
    private Channel channel;
    private User sender;
    private List<Message> recentMessages;
    
    public ChatUpdatesServerMsg() {
        super("chat.presence");
    }
}
