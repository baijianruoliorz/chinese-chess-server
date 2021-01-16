package io.github.yxr1024.chinesechess.ws;

import io.github.yxr1024.chinesechess.user.User;
import lombok.Data;

/**
 * 客户端消息
 */
@Data
public class ClientMessage {
    private User user;
}

