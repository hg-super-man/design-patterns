package com.hg.decorator.use;

/**
 * Create By lhy on 2020/1/19 0019 17:59.
 */
public class MainTest {
    public static void main(String[] args) {
        //一个顾客A来了，要一杯原味奶茶
        Component milkTea = new ConcreteComponentA();
        System.out.println(milkTea.getDescription() + " : " + milkTea.getCost() + "元");

        //一个顾客B来了，要一杯珍珠奶茶
        Component milkTeaB = new ConcreteComponentA();
        milkTeaB = new ConcreteDecoratorA(milkTeaB);
        System.out.println(milkTeaB.getDescription() + " : " + milkTeaB.getCost() + "元");
        //一个顾客C来了，要一杯椰果奶茶
        Component milkTeaC = new ConcreteComponentA();
        milkTeaC = new ConcreteDecoratorB(milkTeaC);
        System.out.println(milkTeaC.getDescription() + " : " + milkTeaC.getCost() + "元");
        //一个顾客D来了，要一杯椰果奶茶，加双份椰果

        Component milkTeaD = new ConcreteComponentA();
        milkTeaD = new ConcreteDecoratorB(milkTeaD);
        milkTeaD = new ConcreteDecoratorB(milkTeaD);
        System.out.println(milkTeaD.getDescription() + " : " + milkTeaD.getCost() + "元");
        //一个顾客E来了，要一杯无糖、珍珠椰果、奶茶
        Component milkTeaE = new ConcreteComponentB();
        milkTeaE = new ConcreteDecoratorA(milkTeaE);
        milkTeaE = new ConcreteDecoratorB(milkTeaE);
        System.out.println(milkTeaE.getDescription() + " : " + milkTeaE.getCost() + "元");
    }
}
