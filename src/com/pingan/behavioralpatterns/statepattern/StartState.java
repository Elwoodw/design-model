package com.pingan.behavioralpatterns.statepattern;

public class StartState implements State{

    @Override
    public void doAction(Context context) {
        context.setState(this);

    }
}
