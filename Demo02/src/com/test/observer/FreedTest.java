package com.test.observer;

public class FreedTest {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new NYTimes());
    }
}
