package com.test.demo2.Strategy;

/**
 * 上下文
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.Algoritmlnterface();
    }
}
