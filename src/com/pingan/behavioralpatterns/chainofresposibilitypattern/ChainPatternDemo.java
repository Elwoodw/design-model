package com.pingan.behavioralpatterns.chainofresposibilitypattern;

public class ChainPatternDemo {

    public  static  AbstractLogger getChainOfLoggers()
    {
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
      AbstractLogger chain=getChainOfLoggers();
      chain.logMessage(AbstractLogger.INFO,"");
      chain.logMessage(AbstractLogger.DEBUG,"");
      chain.logMessage(AbstractLogger.ERROR,"");

    }
}
