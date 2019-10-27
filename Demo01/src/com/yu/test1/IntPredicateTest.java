package com.yu.test1;

import java.util.function.IntPredicate;

/**
 * @author chenyu
 * @time 2019/10/25 22:39
 * @Description:
 */
public class IntPredicateTest {
    public static boolean test(Integer num){
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        return evenNumbers.test(num);
    }

    public static void main(String[] args) {
        System.out.println(test(1000));
    }
}
