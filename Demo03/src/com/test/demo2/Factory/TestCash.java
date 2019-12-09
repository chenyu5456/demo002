package com.test.demo2.Factory;

public class TestCash {
    public static void main(String[] args) {
        CashSuper cash = new CashReturn(300,700);
        double v = cash.acceptCash(8000);
        System.out.println(v);
    }
}
