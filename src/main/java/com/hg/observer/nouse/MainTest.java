package com.hg.observer.nouse;

/**
 * 不使用观察者模式时
 * Create By lhy on 2020/1/19 0019 11:13.
 */
public class MainTest {
    public static void main(String[] args) {
        //当前有A和B两个平台
        IPlatformA iPlatformA = new PlatformAImpl();
        IPlatformB iPlatformB = new PlatformBImpl();

        //当用户发送消息
        String message = "消息";

        //用户的消息变动会在AB平台有显示
        iPlatformA.update(message);
        //当用户发送消息

        String message2 = "消息2";
        iPlatformB.update(message2);
        /**
         * 遇到的问题
         * 1、如果出现底三个平台，第四个，那扩展性很差，代码改动很多
         * 2、如果一个平台移出，那么需要删除代码实现
         * 如果后面加入别的类似发送消息功能，那么每个平台都需要新开一个接口为其服务
         */
    }
    
}
