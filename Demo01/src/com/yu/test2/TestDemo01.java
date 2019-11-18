package com.yu.test2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
    }


    public static void test1(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Comparator<Dish> comparing = Comparator.comparing(Dish::getNum);
        Optional<Dish> collect = menu.stream().collect(Collectors.minBy(comparing));
        System.out.println(collect);
    }

    public static void test2(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );

        Integer collect = menu.stream().collect(Collectors.summingInt(Dish::getNum));
        System.out.println(collect);
    }

    public static void test3(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        String collect = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static void test4(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Integer collect = menu.stream().collect(Collectors.reducing(0, Dish::getNum, (i, j) -> i + j));
        System.out.println(collect);
    }


    public static void test5(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Dish dish = menu.stream().collect(Collectors.reducing((d1, d2) -> d1.getNum() > d2.getNum() ? d1 : d2)).get();
        System.out.println(dish);
    }

    public static void test6(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Long collect = menu.stream().collect(counting());

        int sum = menu.stream().mapToInt(Dish::getNum).sum();
        System.out.println(collect  + " , " + sum);
    }

    public static <T> Collector<T, ?, Long> counting(){
        return Collectors.reducing(0L, e -> 1L, Long::sum);
    }

    public static void test7(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        String s = menu.stream().map(Dish::getName).collect(Collectors.reducing((s1, s2) -> s1 + "," + s2)).get();
        System.out.println(s);
    }

    public static void test8(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        String collect = menu.stream().collect(Collectors.reducing("", Dish::getName, (s1, s2) -> s1 + "," + s2));
        System.out.println(collect);
    }


    public static void test9(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Map<Integer, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(Dish::getNum));
        System.out.println(collect);
    }

    public static void test10(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Map<CaloricLevel, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getNum() <= 400) return CaloricLevel.DIET;
            else if (dish.getNum() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }));
        System.out.println(collect);
    }

    public static void test11(){
        List<Dish> menu = Arrays.asList(
                new Dish("yu", false , 800),
                new Dish("chen", false , 700),
                new Dish("test", false , 300)
        );
        Map<String, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(Dish::getName));
        System.out.println(collect);
    }
}
