package com.hg.decorator.nouse;

/**
 * Create By lhy on 2020/1/19 0019 17:23.
 */
public class MainTest {
    public static void main(String[] args) {
        //顾客A来了一杯原味奶茶
        MilkTea milkTea = new MilkTea();
        System.out.println(milkTea.getDescription()+"----"+milkTea.getCost());
        //顾客B来了一杯珍珠奶茶
        DubbleMilkTea dubbleMilkTea = new DubbleMilkTea();
        System.out.println(dubbleMilkTea.getDescription()+"----"+dubbleMilkTea.getCost());
        //顾客C来了一杯椰果奶茶
        CocountMilkTea cocountMilkTea = new CocountMilkTea();
        System.out.println(cocountMilkTea.getDescription()+"----"+cocountMilkTea.getCost());
    }
}
