package com.hg.observer.nouse;

/**
 * A平台所给出的接口实现
 * Create By lhy on 2020/1/19 0019 11:11.
 */
public class PlatformAImpl implements IPlatformA {
    @Override
    public void update(String message) {
        System.out.println("来自A平台 " + message);
    }
}
