package com.hg.decorator.nouse;

/**
 * 奶茶的父类，最基本的奶茶
 * Create By lhy on 2020/1/19 0019 17:17.
 */
public class MilkTea {

    /**
     * 获取这个奶茶的描述
     * @return
     */
    public String getDescription(){
        return "奶茶";
    }

    public double getCost(){
        return 5;
    }

}
