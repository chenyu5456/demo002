package com.test.observer;

public class NYTimes implements Observer {
    @Override
    public void notity(String tweet) {
        System.out.println("Breaking news in NY!" + tweet);
    }
}
