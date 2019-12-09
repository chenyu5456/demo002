package com.test.demo2.CashStrategy;

import com.test.demo2.Factory.CashSuper;

/**
 * 上下文
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double GetResult(double money){
        return cashSuper.acceptCash(money);
    }
}
