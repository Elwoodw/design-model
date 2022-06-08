package com.pingan.behavioralpatterns.mediatorpattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("");
        john.sendMessage("");
    }
}
