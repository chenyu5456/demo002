package com.yu.test2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;

public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        numbers.stream().filter(i -> i%2==0).distinct().forEach(System.out :: println);
//        numbers.stream().filter(i -> i>=2).limit(3).forEach(System.out::println);
        numbers.stream().filter(i -> i>=2).skip(3).forEach(System.out::println);
    }
}
