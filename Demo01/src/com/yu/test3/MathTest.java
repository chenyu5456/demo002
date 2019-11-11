package com.yu.test3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathTest {
    public static void main(String[] args) {
        test();
    }

    /**
     * 勾股数-初步
     */
    public static void test(){
        Stream<int[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
        stream.forEach(System.out::println);
    }

    public static void test1(){
        Stream<double[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                        .filter(t -> t[2] % 1 == 0));
        stream.forEach(System.out::println);
    }
}
