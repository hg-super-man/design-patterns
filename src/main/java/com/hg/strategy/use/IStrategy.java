package com.hg.strategy.use;

/**
 * 抽象策略类
 */
public interface IStrategy {
    /**
     * 根据不同的策略计算得出结果
     * @param data
     * @return
     */
    int calculate(int data);
}
