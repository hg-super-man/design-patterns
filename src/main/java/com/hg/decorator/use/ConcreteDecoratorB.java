package com.hg.decorator.use;

/**
 * Create By lhy on 2020/1/19 0019 17:57.
 */
public class ConcreteDecoratorB extends Decorator {
    Component component;

    /**
     * 利用构造方法设置组件
     * @param component
     */
    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    /**
     * 加上描述方法
     * @return
     */
    @Override
    public String getDescription() {
        return component.getDescription() + " 加椰果";
    }

    /**
     * 加上价格
     * @return
     */
    @Override
    public double getCost(){
        return 3 + component.getCost();
    }
}
