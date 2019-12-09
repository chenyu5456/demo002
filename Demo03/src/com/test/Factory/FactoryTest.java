package com.test.Factory;

import com.test.Operation;
import com.test.Operation1;

public class FactoryTest {
    public static void main(String[] args) {
        testfactory();
    }

    public static void testfactory(){
        Operation1 oper;
        oper = OperationFactory.creatrOperation("-");
        oper.set_numberA(1);
        oper.set_numberB(2);
        try {
            double v = oper.GetResult();
            System.out.println(v);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
