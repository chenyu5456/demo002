package com.test.demo2.Factory;

public class CashFactory {
    private CashSuper cashSuper;

    public CashSuper createEntity(String type){
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
        return cashSuper;
    }

}
