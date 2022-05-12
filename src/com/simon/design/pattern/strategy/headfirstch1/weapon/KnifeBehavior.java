package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
