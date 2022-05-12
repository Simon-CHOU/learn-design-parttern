package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow");
    }
}
