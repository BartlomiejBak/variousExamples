package com.bartekbak.behavioral.strategy;

public class SecondMethodAStrategy implements ISecondMethodStrategy {
    @Override
    public void doSomething() {
        System.out.println("This is a second method with com.company.behavioral.strategy 'A' - it prints value of 2+2 ");
        int value = 2 + 2;
        System.out.println("value of 2+2 is " + value);
    }
}
