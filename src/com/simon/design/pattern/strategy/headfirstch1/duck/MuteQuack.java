package com.simon.design.pattern.strategy.headfirstch1.duck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
