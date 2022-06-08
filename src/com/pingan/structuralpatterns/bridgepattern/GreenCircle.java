package com.pingan.structuralpatterns.bridgepattern;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("greenCircle");
    }
}
