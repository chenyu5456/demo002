package com.yu.test2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        numbers.stream().filter(i -> i%2==0).distinct().forEach(System.out :: println);
//        numbers.stream().filter(i -> i>=2).limit(3).forEach(System.out::println);
//        numbers.stream().filter(i -> i>=2).skip(3).forEach(System.out::println);

        test12();
    }

    public static void test1() {
        String[] streamOfwords = {"hello", "world"};
        Arrays.stream(streamOfwords).map(word -> word.split("")).forEach(System.out::println);
    }

    public static void test2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }

    public static void test3() {
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(4, 5);
        List<int[]> collect = number1.stream().flatMap(a -> number2.stream().map(b -> new int[]{a, b})).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    public static void test4() {
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(4, 5);
        number1.stream().flatMap(a -> number2.stream().filter(b -> (a + b) % 3 == 0).map(b -> new int[]{a, b})).collect(Collectors.toList());
    }

    public static void test5() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> first = someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst();
        System.out.println(first);
    }

    public static void test6() {
        List<Integer> someNumbers = Arrays.asList(8, 2, 9, 5, 1);
        Integer integer = someNumbers.stream().reduce(Integer::max).get();
        System.out.println(integer);
    }

    public static void test7() {
        List<Integer> someNumbers = Arrays.asList(8, 2, 9, 5, 1);
        Integer integer = someNumbers.parallelStream().reduce(0, Integer::max);
        System.out.println(integer);
    }

    public static void test8() {
        Stream<String> hello = Stream.of("hello", "world");
        hello.map(String::toUpperCase).forEach(System.out::println);
    }

    public static void test9() {
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
    }

    public static void test10(){
        Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0]+t[1]})
                .limit(10).forEach(t -> System.out.println("(" + t[0]+","+ t[1] + ")"));
    }

    /**
     * 斐波纳契元组序列
     */
    public static void test11(){
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(20).map(t -> t[0]).forEach(System.out::println);
    }

    public static void test12(){
        Stream.generate(Math::random)
                .limit(5).forEach(System.out::println);

    }

}
