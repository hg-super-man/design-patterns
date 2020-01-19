package com.hg.strategy.use;

/**
 * 环境类，负责使用算法策略，其中维持了一个抽象策略类的引用实例
 * Create By lhy on 2020/1/18 0018 17:32.
 */
public class Context {
    /** 算法计算结果*/
    private int result;

    /**
     * 采用不同策略的算法
     */
    private IStrategy strategy;

    /**
     * 获取算法计算结果
     * @return
     */
    public int getResult(){
        result = strategy.calculate(result);
        return result;
    }

    /**
     * 获取算法
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
