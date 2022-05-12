package com.simon.design.pattern.strategy.headfirstch1.weapon;

public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    abstract void fight();
}
