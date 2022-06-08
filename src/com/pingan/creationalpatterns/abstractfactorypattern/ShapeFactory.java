package com.pingan.creationalpatterns.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape==null)
        {
            return null;
        }
        else if(shape.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        else if(shape.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        else
        {
            return null;
        }
    }
}
