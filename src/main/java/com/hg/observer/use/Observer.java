package com.hg.observer.use;

/**
 * 抽象观察者
 * Create By lhy on 2020/1/19 0019 14:19.
 */
public interface Observer {
    /**
     * 当主题发送消息时调用
     * @param message
     */
    void update(String message);
}
