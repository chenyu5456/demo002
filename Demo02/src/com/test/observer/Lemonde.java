package com.test.observer;

public class Lemonde implements Observer {
    @Override
    public void notity(String tweet) {
        System.out.println("Today cheese, wine and news! " + tweet);
    }
}
