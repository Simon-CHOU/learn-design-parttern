package com.simon.design.pattern.strategy.headfirstch1.duck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
