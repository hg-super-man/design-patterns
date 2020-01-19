package com.hg.decorator.use;

/**
 * Create By lhy on 2020/1/19 0019 17:48.
 */
public class ConcreteComponentA extends Component {

    @Override
    public String getDescription(){
        return "A"+super.getDescription();
    }

    @Override
    public double getCost(){
        return super.getCost() + 1;
    }
}
