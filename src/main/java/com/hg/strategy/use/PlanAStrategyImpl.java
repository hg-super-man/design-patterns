package com.hg.strategy.use;

/**
 * 策略A的实现方案
 * Create By lhy on 2020/1/18 0018 17:41.
 */
public class PlanAStrategyImpl implements IStrategy {

    @Override
    public int calculate(int data) {
        return data*2;
    }
}
