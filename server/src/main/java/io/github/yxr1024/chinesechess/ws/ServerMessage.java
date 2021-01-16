package io.github.yxr1024.chinesechess.ws;

import lombok.Getter;
import lombok.Setter;

/**
 * 服务端消息结构
 * @author Hu Lang
 */
public class ServerMessage {
    @Setter
    @Getter
    protected int code;

    @Setter
    @Getter
    protected String msg;

    @Getter
    private String type;

    public ServerMessage(String type) {
        this.type = type;
    }
}

