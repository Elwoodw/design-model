package com.pingan.behavioralpatterns.visitorpattern;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
