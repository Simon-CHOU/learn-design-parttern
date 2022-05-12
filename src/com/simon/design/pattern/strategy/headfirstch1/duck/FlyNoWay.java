package com.simon.design.pattern.strategy.headfirstch1.duck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
