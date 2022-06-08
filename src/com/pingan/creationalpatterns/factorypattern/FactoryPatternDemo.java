package com.pingan.creationalpatterns.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Shape shape1=factory.getShape("Rectangle");
        shape1.draw();
        Shape shape2=factory.getShape("Circle");
        shape2.draw();
        Shape shape3=factory.getShape("Square");
        shape3.draw();

    }
}
