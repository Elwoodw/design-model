package com.pingan.behavioralpatterns.visitorpattern;

public class Keyboard implements  ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
