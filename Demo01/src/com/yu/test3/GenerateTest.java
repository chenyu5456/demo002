package com.yu.test3;

import com.yu.test2.Transaction;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;
            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };

        IntStream.generate(fib).limit(10).forEach(System.out::println);
    }

    public static void test2(){
        List<Transaction> transactions = new ArrayList<>();
        Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
    }
}
