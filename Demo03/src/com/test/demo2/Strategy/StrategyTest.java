package com.test.demo2.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
