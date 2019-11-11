package com.yu.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDemo01 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );

        Stream<Dish> stream = menu.stream();
        stream.forEach(System.out::println);

        IntStream intStream = IntStream.rangeClosed(0, 100).filter(n -> n % 2 == 0);
        System.out.println(intStream.sum());
    }

}
