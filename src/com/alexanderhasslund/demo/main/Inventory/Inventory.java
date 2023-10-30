package com.alexanderhasslund.demo.main.Inventory;

import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.Shop.Weapon.Swords;

public class Inventory {

    private String itemName;
    private int damage;
    private int initiative;
    private int levelLock;

    public Inventory(String itemName) {
        this.itemName = itemName;
    }

    public Inventory(String standardSword, int damage, int initiative, int levelLock) {
        this.itemName = standardSword;
        this.damage = damage;
        this.initiative = initiative;
        this.levelLock = levelLock;
    }

    public String getItemName() {
        return itemName;
    }


    @Override
    public String toString() {
        return "Inventory{" +
                "itemName='" + itemName + '\'' +
                '}';
    }
}

