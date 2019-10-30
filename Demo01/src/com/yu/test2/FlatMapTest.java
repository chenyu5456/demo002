package com.yu.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        test8();
    }

    public static void test() {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> collect = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void test2() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = nums.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void test3() {
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);
        List<int[]> collect = num1.stream().flatMap(i -> num2.stream().map(j -> new int[]{i, j})).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void test4(){
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);
        List<int[]> collect = num1.stream().flatMap(i -> num2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * 元素求和
     * 使用 reduce 方法
     */
    public static void test5(){
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        Integer reduce = num1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }

    public static void test6(){
        List<Integer> num1 = Arrays.asList(5, 4, 3, 9, 1);
        Optional<Integer> reduce = num1.stream().reduce(Integer::min);
        System.out.println(reduce.get());
    }

    public static void test7(){
        List<Integer> num1 = Arrays.asList(5, 4, 3, 9, 1, 2);
        Integer reduce = num1.stream().map(a -> 1).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }

    public static void test8(){
        List<Integer> num1 = Arrays.asList(5, 4, 3, 9, 1, 2);
        long count = num1.stream().count();
        System.out.println(count);
    }
}
