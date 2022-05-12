package com.simon.design.pattern.strategy.headfirstch1.duck;

public class MallardDuck extends Duck {
    // set the duck’s behavior type through a setter method on the
    //duck subclass, rather than by instantiating it in the duck’s constructor.
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
