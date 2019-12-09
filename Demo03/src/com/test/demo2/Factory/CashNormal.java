package com.test.demo2.Factory;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
