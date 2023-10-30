package com.alexanderhasslund.demo.main.Shop.Weapon;

import com.alexanderhasslund.demo.main.Inventory.Inventory;

public class Swords extends Weapon {

    private String name;
    private int damage;
    private int initiative;
    private int levelLock;


    public Inventory standardSword() {
        Inventory standardSword = new Inventory("Standard sword",6, 40, 0);
        return standardSword;
    }

    public Inventory fastSword() {
        Inventory fastSword = new Inventory("Fast sword",3, 60, 2);
        return fastSword;
    }

    public Inventory sharpSword() {
        Inventory sharpSword = new Inventory("Sharp sword",20, 55, 5);
        return sharpSword;
    }

    public Inventory divineSword() {
        Inventory divineSword = new Inventory("Divine sword",60, 85, 15);
        return divineSword;
    }


    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }

}
