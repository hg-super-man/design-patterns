package com.hg.observer.use;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体目标
 * Create By lhy on 2020/1/19 0019 14:26.
 */
public class ConcreteSubject implements Subject{
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

}
