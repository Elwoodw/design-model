package com.pingan.structuralpatterns.proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxy=new ProxyImage("");
        proxy.display();
        proxy.display();
    }
}
