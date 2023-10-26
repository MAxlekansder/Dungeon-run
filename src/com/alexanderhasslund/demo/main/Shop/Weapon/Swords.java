package com.alexanderhasslund.demo.main.Shop.Weapon;

public class Swords extends Weapon {

    private int damage;
    private int initiative;
    private int levelLock;


    public void standardSword() {
        this.damage = 6;
        this.initiative = 40;
        this.levelLock = 0;
    }

    public void fastSword() {
        this.damage = 3;
        this.initiative = 60;
        this.levelLock = 2;
    }

    public void sharpSword() {
        this.damage = 20;
        this.initiative = 55;
        this.levelLock = 5;
    }


    public void divineSword() {
        this.damage = 60;
        this.initiative = 85;
        this.levelLock = 10;
    }
}
