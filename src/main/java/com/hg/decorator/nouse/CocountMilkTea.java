package com.hg.decorator.nouse;

/**
 * Create By lhy on 2020/1/19 0019 17:19.
 */
public class CocountMilkTea extends MilkTea{

    @Override
    public String getDescription(){
        return "椰果" + super.getDescription();
    }

    @Override
    public double getCost(){
        return super.getCost() + 1;
    }
}
