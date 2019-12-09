package com.test.demo2.Factory;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
