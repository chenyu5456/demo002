package com.yu.test;

import java.util.Comparator;

public class RunnableTest {
    public static void test() {
        Runnable runnable = () -> run();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void precess(Runnable r){
        r.run();
    }

    public static void main(String[] args) {
        System.out.println("strat");
        test();
        System.out.println("end");
        Apple app1 = new Apple();
        app1.setWeight(10);
        Apple app2 = new Apple();
        app2.setWeight(5);
        Comparator<Apple> test = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
        int compare = test.compare(app1, app2);
        System.out.println(compare);
        precess(() -> System.out.println(10086));
    }
}
