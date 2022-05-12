package com.simon.design.pattern.template_method.headfirstch8.beverage;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantCondiments() {
        return true;
    }
}
