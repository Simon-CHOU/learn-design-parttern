package com.simon.design.pattern.strategy.headfirstch1.duck;

public class ModelDuck extends Duck {
    // set the duck’s behavior type through a setter method on the
    //duck subclass, rather than by instantiating it in the duck’s constructor.
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
