package com.pingan.behavioralpatterns.visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
