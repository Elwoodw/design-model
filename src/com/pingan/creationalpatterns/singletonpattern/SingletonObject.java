package com.pingan.creationalpatterns.singletonpattern;

public class SingletonObject {
    private  static  SingletonObject object=new SingletonObject();

    private  SingletonObject(){}

    public static SingletonObject getInstance()
    {
        return object;
    }

    public  void showMessage()
    {
        System.out.println("Hello World");
    }
}
