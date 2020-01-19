package com.hg.strategy.nouse;

/**
 * Create By lhy on 2020/1/18 0018 17:28.
 */
public class MainTestOne {
    /**
     * 如果不使用设计模式
     * @param args
     */
    public static void main(String[] args) {
        int conditin = 0;
        int result = 100;
        //如果满足天剑，则使用第一种策略
        if (conditin == 1) {
            result *= 2;
        } else if (conditin == 2) {
            result *= 5;
        }
        System.out.println(result);

    }
}
