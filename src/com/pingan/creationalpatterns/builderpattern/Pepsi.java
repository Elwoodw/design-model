package com.pingan.creationalpatterns.builderpattern;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
