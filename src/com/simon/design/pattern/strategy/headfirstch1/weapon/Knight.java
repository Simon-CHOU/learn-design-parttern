package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class Knight extends  Character{
    public Knight() {
        this.weapon = new SwordBehavior();
    }

    @Override
    void fight() {
        System.out.print("Knight fight: ");
        weapon.useWeapon();
    }
}
