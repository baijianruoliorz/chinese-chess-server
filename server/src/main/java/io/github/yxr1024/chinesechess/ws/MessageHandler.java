package io.github.yxr1024.chinesechess.ws;

/**
 * 消息处理器
 */
public interface MessageHandler<T> {
  void handle(T message);
}