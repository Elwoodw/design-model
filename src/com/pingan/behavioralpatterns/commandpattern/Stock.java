package com.pingan.behavioralpatterns.commandpattern;

public class Stock {
    private String name="ABC";
    private int quantity=10;
    public void buy(){
        System.out.println("buy");
    }
    public void sell(){
        System.out.println("sell");
    }

}
