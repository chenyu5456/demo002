package com.yu.test1;

import com.yu.test.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static<T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> results = new ArrayList<>();
        for(T s:list){
            results.add(s);
        }
        return results;
    }

    public static void main(String[] args) {
        Predicate<String> non = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(Arrays.asList("a","b"), non);
        System.out.println(nonEmpty);
    }
}
