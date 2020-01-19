package com.hg.decorator.nouse;

/**
 * Create By lhy on 2020/1/19 0019 17:22.
 */
public class DubbleMilkTea extends MilkTea {
    @Override
    public String getDescription() {
        return "珍珠" + super.getDescription();
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

}
