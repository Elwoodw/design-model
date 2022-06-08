package com.pingan.behavioralpatterns.oberverpattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        subject.setState(10);
        subject.setState(15);
    }
}
