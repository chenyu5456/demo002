package com.yu.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T s : list) {
            c.accept(s);
        }
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println(s);
        forEach(Arrays.asList("a", "b", "1", "0", "0", "8", "6"), consumer);
    }
}
