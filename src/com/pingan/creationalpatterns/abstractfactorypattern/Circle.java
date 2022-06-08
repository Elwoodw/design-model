package com.pingan.creationalpatterns.abstractfactorypattern;

import com.pingan.creationalpatterns.abstractfactorypattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
