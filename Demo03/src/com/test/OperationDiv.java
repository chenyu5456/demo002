package com.test;

public class OperationDiv extends Operation1 {
    @Override
    public double GetResult() throws Exception {
        double result = 0;

        if(get_numberB() == 0){
            throw new Exception("除数不能为0");
        }
        result = get_numberA() / get_numberB();
        return result;
    }
}
