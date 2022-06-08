package com.pingan.creationalpatterns.builderpattern;

public abstract class ColdDrink implements Item{
    @Override
    public Packing pack() {
        return new Bottle();
    }
}
