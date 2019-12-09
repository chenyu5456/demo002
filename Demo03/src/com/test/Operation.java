package com.test;

/**
 * 工具类（没使用工厂模式）
 */
public class Operation {
    public static Double GetResult(Double numberA, Double numberB, String operate){
        Double result = 0d;
        switch (operate){
            case "+":
                result =  numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;

        }

        return result;
    }
}
