package com.test;

public class OpertionSub extends Operation1 {
    @Override
    public double GetResult() throws Exception {
        double result = 0;
        result = get_numberA() - get_numberB();
        return result;
    }
}
