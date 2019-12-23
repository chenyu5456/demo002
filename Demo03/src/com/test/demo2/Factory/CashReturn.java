package com.test.demo2.Factory;

public class CashReturn implements CashSuper {

    private double returnManey;

    public CashReturn(double returnManey) {
        this.returnManey = returnManey;
    }

    @Override
    public double acceptCash(double money) {
        return money*returnManey;
    }
}
