package com.pingan.creationalpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item>meal=new ArrayList<>();
    public void addItem(Item item)
    {
        meal.add(item);
    }

    public  float cost()
    {
        float cost=0f;
        for(Item item:meal)
        {
            cost+=item.price();
        }
        return cost;
    }
    public  void showItems()
    {
        for(Item item:meal)
        {
            System.out.println(item.name());
            System.out.println(item.pack().pack());
            System.out.println(item.price());
            System.out.println();
        }
    }
}
