package com.yu.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("a", "b", "A", "B", "c");
        test2(str);
        DoubleFunction<Double> doubleDoubleFunction = (double x) -> x + 10;
        System.out.println(doubleDoubleFunction.apply(10));
    }
    public static void test1(List<String> str){
        str.sort(String :: compareToIgnoreCase);
        System.out.println(str);
    }
    public static void test2(List<String> str){
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(str);
    }
}
