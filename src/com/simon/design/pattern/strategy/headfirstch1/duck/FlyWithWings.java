package com.simon.design.pattern.strategy.headfirstch1.duck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
