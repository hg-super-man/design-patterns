package com.hg.observer.use;

/**
 * Create By lhy on 2020/1/19 0019 14:23.
 */
public class ConcreteObserver implements Observer {
    private String platform;

    public ConcreteObserver(String platform) {
        this.platform = platform;
    }
    @Override
    public void update(String message) {
        System.out.println("来自"+platform+"的消息-》"+message);
    }

    /**
     * 获取平台名称
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置平台名称
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
