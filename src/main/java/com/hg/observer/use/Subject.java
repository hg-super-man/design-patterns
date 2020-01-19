package com.hg.observer.use;

/**
 * 抽象目标（主题）
 * Create By lhy on 2020/1/19 0019 14:20.
 */
public interface Subject {
    /**
     * 观察者注册（订阅）这个主题
     * @param observer
     */
    void register(Observer observer);

    /**
     * 观察者取消订阅这个主题
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知所有订阅这个主题的观察者
     * @param message
     */
    void notifyObserver(String message);
}
