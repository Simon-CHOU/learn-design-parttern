package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
