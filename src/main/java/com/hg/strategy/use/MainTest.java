package com.hg.strategy.use;

/**
 * Create By lhy on 2020/1/18 0018 17:44.
 */
public class MainTest {
    public static void main(String[] args) {
        //设定环境类A
        Context context = new Context();
        //设定策略A
        context.setStrategy(new PlanAStrategyImpl());
        //设置原始数据值
        context.setResult(100);
        //计算结果
        System.out.println(context.getResult());

        //设定环境类A
        Context context2 = new Context();
        //设置原始数据值
        context2.setResult(100);
        //设定策略B
        context2.setStrategy(new PlanBStrategyImpl());
        //计算结果
        System.out.println(context2.getResult());
    }
}
