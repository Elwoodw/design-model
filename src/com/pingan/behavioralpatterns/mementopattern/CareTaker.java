package com.pingan.behavioralpatterns.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento>list=new ArrayList<>();

    public  void add(Memento state)
    {
        list.add(state);
    }

    public Memento get(int idx)
    {
        return list.get(idx);
    }
}
