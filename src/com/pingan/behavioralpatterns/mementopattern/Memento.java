package com.pingan.behavioralpatterns.mementopattern;

public class Memento {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
