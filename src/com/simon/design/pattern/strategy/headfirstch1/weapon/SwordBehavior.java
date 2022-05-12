package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
