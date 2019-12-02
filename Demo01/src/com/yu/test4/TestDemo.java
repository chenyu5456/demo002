package com.yu.test4;

import java.util.concurrent.RecursiveTask;
import java.util.function.Function;
import java.util.stream.LongStream;

public class TestDemo {
    public static void main(String[] args) {
        long start = System.nanoTime();
//        parallelRangedSum(100L);
//        sindeEffectSum(100);
        sideEffectParallelSum(100);
        System.out.println((System.nanoTime() - start) /1000000);
    }

    public static Long measureSumPerf(Function<Long,Long> adder, Long n){
        Long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++){
            Long start = System.nanoTime();
            Long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1000000;
            if (duration < fastest){
                fastest = duration;
            }
        }
        return fastest;
    }

    public static Long parallelRangedSum(Long n){
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }

    public static long sindeEffectSum(long n){
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1,n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    public static class Accumulator{
        public long total = 0;
        public void add(long value){
            total += value;
        }
    }
}
