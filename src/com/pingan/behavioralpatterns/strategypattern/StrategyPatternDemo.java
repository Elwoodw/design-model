package com.pingan.behavioralpatterns.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1,2));
        context=new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(2,1));
    }
}
