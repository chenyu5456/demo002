package com.yu.test3;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println(partitionPrimes(100));
        System.out.println(parallelSum(10));
    }

    public static boolean isPrime(int candidate){
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n){
        return IntStream.rangeClosed(2, n).boxed().collect(Collectors.groupingBy(candidate -> isPrime(candidate)));
    }

    public static<A> List<A> takeWhile(List<A> list, Predicate<A> p){
        int i = 0;
        for (A item : list){
            if (p.test(item)) {
                return list.subList(0, i);
            }
            i++;
        }
        return list;
    }

    public static boolean isPrime(List<Integer> primes, int candidate){
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return takeWhile(primes, i -> i <= candidateRoot).stream().noneMatch(p -> candidate % p == 0);
    }

    //并行流
    public static long parallelSum(long n){
        return Stream.iterate(1L, i -> i+1)
                .limit(n).parallel().reduce(0L, Long::sum);
    }
}
