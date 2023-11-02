package com.alexanderhasslund.demo.main.Shop.Defence;

import com.alexanderhasslund.demo.main.Inventory.Inventory;

public class Shields extends Defence {

    private String name;
    private int damage;
    private int initiative;
    private int levelLock;
    private int defence;
    private int block;

    public Inventory standardShield() {
        Inventory standardShield = new Inventory("Standard shield",0,0,0,5,1);
        return standardShield;
    }

    public Inventory bulkShield() {
        Inventory bulkShield = new Inventory("Bulk shield",0,0,2,10,1);
        return bulkShield;
    }

    public Inventory spikedShield() {
        Inventory spikedShield = new Inventory("spiked shield",2,0,5,15,5);
        return spikedShield;
    }

    public Inventory divineShield() {
        Inventory divineShield = new Inventory("Divine shield",2,0,15,40,30);
        return divineShield;
    }

    public int getDamage() {
        return damage;
    }

    public int getInitiative() {
        return initiative;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public int getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }
}
