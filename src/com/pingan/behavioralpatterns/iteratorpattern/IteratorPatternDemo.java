package com.pingan.behavioralpatterns.iteratorpattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        Iterator iterator=nameRepository.getIterator();
        while (iterator.hasNext())
        {
            String name=(String)iterator.next();
            System.out.println(name);
        }
    }
}
