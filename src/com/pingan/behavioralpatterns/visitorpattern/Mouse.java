package com.pingan.behavioralpatterns.visitorpattern;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
