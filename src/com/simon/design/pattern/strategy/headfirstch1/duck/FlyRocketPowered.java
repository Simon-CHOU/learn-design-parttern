package com.simon.design.pattern.strategy.headfirstch1.duck;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
