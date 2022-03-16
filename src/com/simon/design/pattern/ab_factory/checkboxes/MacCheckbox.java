package com.simon.design.pattern.ab_factory.checkboxes;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
