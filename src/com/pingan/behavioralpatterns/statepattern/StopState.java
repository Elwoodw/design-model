package com.pingan.behavioralpatterns.statepattern;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }
}
