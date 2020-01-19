package com.hg.observer.nouse;

/**
 * B平台所给出的接口实现
 * Create By lhy on 2020/1/19 0019 11:11.
 */
public class PlatformBImpl implements IPlatformB {
    @Override
    public void update(String message) {
        System.out.println("来自B平台 " + message);
    }
}
