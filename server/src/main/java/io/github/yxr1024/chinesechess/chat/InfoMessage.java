package io.github.yxr1024.chinesechess.chat;

public class InfoMessage extends SystemMessage {
    public InfoMessage(String content) {
        super(content);
    }

    public InfoMessage(String content, Channel channel) {
        super(content);
        this.setChannelId(channel.getId());

    }
}
