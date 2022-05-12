package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class Queen extends  Character{
    public Queen() {
        this.weapon = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.print("Queen fight: ");
        weapon.useWeapon();
    }
}
