package com.test.Factory;

import com.test.*;

public class OperationFactory {
    public static Operation1 creatrOperation(String operate){
        Operation1 oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OpertionSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }

        return oper;
    }
}
