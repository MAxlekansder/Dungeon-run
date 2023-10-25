package com.alexanderhasslund.demo.main.Player;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.Items.Items;
import com.alexanderhasslund.demo.main.TalentTree.TalentTree;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int experience;
    private int level;
    private int initative;
    private int currency;

    //kolla upp hur initialCapacity faktiskt fungerar
    List<Player> playerList = new ArrayList<>();
    List<Items> itemList = new ArrayList<>(5);
    //kolla om det här faktiskt är bäst sätt att spara detta på? Finns det en bättre practice?
    List<IClasses> playerClass = new ArrayList<>(1);
    List<TalentTree> talentTreeList = new ArrayList<>(3);
    List<Inventory> inventoryList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //find a formula for exp? <- no need now
    public int levelUp() {
        if (experience == 100) {
            level += level;

        }
        return level;
    }

    //uses for setting player array <- look into it
    public Player(int experience, int level, int currency) {
        this.experience = experience;
        this.level = level;
        this.currency = currency;
    }
}
