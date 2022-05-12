package com.simon.design.pattern.strategy.headfirstch1.duck;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
