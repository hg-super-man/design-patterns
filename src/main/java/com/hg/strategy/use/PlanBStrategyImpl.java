package com.hg.strategy.use;

/**
 * 策略B的实现方式
 * Create By lhy on 2020/1/18 0018 17:41.
 */
public class PlanBStrategyImpl implements IStrategy {

    @Override
    public int calculate(int data) {
        return data*5;
    }
}
