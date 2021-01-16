package io.github.yxr1024.chinesechess.chat.command;

import io.github.yxr1024.chinesechess.chat.Channel;
import io.github.yxr1024.chinesechess.chat.Message;

public interface CommandExecutor {
    void execute(String[] cmdParams, Message message, Channel channel);
}
