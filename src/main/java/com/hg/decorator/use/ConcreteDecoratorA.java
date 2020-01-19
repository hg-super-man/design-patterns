package com.hg.decorator.use;

/**
 * Create By lhy on 2020/1/19 0019 17:51.
 */
public class ConcreteDecoratorA extends Decorator{
    Component component;

    /**
     * 利用构造方法设置组件
     * @param component
     */
    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    /**
     * 叫上描述
     * @return
     */
    @Override
    public String getDescription() {
        return component.getDescription() +" 加珍珠";
    }

    @Override
    public double getCost(){
        return 2 + component.getCost();
    }
}
