package com.test;

public class OperationAdd extends Operation1 {
    @Override
    public double GetResult() {
        double result = 0;
        result = get_numberA() + get_numberB();
        return result;
    }
}
