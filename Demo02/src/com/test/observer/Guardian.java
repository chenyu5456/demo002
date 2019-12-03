package com.test.observer;

public class Guardian implements Observer {
    @Override
    public void notity(String tweet) {
        System.out.println("Yet another news in London... " + tweet);
    }
}
