package com.pingan.structuralpatterns.bridgepattern;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("redCircle");
    }
}
