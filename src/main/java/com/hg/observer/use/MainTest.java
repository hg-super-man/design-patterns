package com.hg.observer.use;

/**
 * Create By lhy on 2020/1/19 0019 14:29.
 */
public class MainTest {
    public static void main(String[] args) {
        //创建观察者
        Observer observerA = new ConcreteObserver("A平台");
        Observer observerB = new ConcreteObserver("B平台");

        Subject subject = new ConcreteSubject();

        subject.register(observerA);
        subject.register(observerB);

        String msg = "消息来了";
        subject.notifyObserver(msg);

        subject.remove(observerA);
        String msg2 = "消息来了2";
        subject.notifyObserver(msg2);

    }
}
