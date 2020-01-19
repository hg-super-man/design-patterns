package com.hg.decorator.use;

/**
 * 抽象构件
 * Create By lhy on 2020/1/19 0019 17:46.
 */
public abstract class Component {
    /**
     * 获取这个奶茶的描述
     */
    public String getDescription(){
        return "奶茶";
    }

    /**
     * 获取这个奶茶的价格
     */
    public double getCost(){
        return 5;
    }
}
