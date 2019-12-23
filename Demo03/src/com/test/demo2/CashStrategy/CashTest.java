package com.test.demo2.CashStrategy;

public class CashTest {
    public static void main(String[] args) {
        CashContext context = new CashContext("正常收费");
        double resultMoney = context.ContextInterface(300);
        System.out.println(resultMoney);
    }
}
