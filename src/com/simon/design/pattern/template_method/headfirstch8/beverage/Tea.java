package com.simon.design.pattern.template_method.headfirstch8.beverage;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping in tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
