package com.simon.design.pattern.strategy.headfirstch1.weapon;

public class BattleGameTestDrive {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();

        Character king = new King();
        king.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();

        //change weapons at any time during the game
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
