package com.yu.test2;

import java.util.Arrays;
import java.util.List;
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
    }

}
