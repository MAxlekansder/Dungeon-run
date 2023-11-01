package com.alexanderhasslund.demo.main.Inventory;

import com.alexanderhasslund.demo.main.Engine.Color;

public class Inventory {

    private String itemName;
    private int damage;
    private int initiative;
    private int levelLock;
    private int defence;
    private int block;



    public Inventory(String standardSword, int damage, int initiative, int levelLock, int defence, int block) {
        this.itemName = standardSword;
        this.damage = damage;
        this.initiative = initiative;
        this.levelLock = levelLock;
        this.defence = defence;
        this.block = block;
    }

    public String getItemName() {
        return itemName;
    }

    public int getDamage() {
        return damage;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getLevelLock() {
        return levelLock;
    }

    public int getDefence() {
        return defence;
    }

    public int getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return Color.WHITE +" Sword Slot:"+ Color.RESET + " || " +
                "itemName = " + itemName + "  || " +
                " damage = " + damage + "  || " +
                " initiative = " + initiative + "  || " +
                " levelLock = " + levelLock + "  ||";
    }
}

