package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class King extends  Character{
    public King() {
        this.weapon = new BowAndArrowBehavior();
    }

    @Override
    void fight() {
        System.out.print("King fight: ");
        weapon.useWeapon();
    }
}
