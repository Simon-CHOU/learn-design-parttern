package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class Troll extends  Character{
    public Troll() {
        this.weapon = new AxeBehavior();
    }

    @Override
    void fight() {
        System.out.print("Troll fight:");
        weapon.useWeapon();
    }
}
