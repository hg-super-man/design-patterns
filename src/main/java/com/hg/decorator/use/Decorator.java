package com.hg.decorator.use;

/**
 * 抽象装饰者类
 * Create By lhy on 2020/1/19 0019 17:47.
 */
public abstract class Decorator extends Component{
    /**
     * 每个具体的装饰者都需要进行描述
     * @return
     */
    @Override
    public abstract String getDescription();
}
