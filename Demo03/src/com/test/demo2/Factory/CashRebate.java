package com.test.demo2.Factory;

public class CashRebate implements CashSuper {
    private double rebateCondition;
    private double rebateMoney;

    public CashRebate(double rebateCondition, double rebateMoney) {
        this.rebateCondition = rebateCondition;
        this.rebateMoney = rebateMoney;
    }

    @Override
    public double acceptCash(double money) {
        double result = 0d;
        if(money >= rebateMoney){
            result = money-Math.floor(money/rebateCondition)*rebateMoney;
        }
        return result;
    }
}
