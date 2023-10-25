package com.alexanderhasslund.demo.main.Items.Weapon.Swords;

import com.alexanderhasslund.demo.main.Items.Weapon.Weapon;

public class Swords extends Weapon {

    private int damage;
    private int initiative;


    public void standardSword() {
        this.damage = 6;
        this.initiative = 40;
    }

    public void fastSword() {
        this.damage = 3;
        this.initiative = 60;
    }

    public void sharpSword() {
        this.damage = 20;
        this.initiative = 55;
    }


    public void divineSword() {
        this.damage = 60;
        this.initiative = 85;
    }
}
