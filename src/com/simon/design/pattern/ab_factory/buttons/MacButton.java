package com.simon.design.pattern.ab_factory.buttons;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOsButton");
    }
}
