package com.test.demo2.CashStrategy;

import com.test.demo2.Factory.CashNormal;
import com.test.demo2.Factory.CashRebate;
import com.test.demo2.Factory.CashReturn;
import com.test.demo2.Factory.CashSuper;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashRebate(300, 100);
                break;
            case "打8折":
                cashSuper = new CashReturn(0.8);
                break;
        }
    }

    public double ContextInterface(double money){
         return cashSuper.acceptCash(money);
    }
}
