package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.TalentTree.TalentTree;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int playerId;
    List<TalentTree> talentTreeList = new ArrayList<>(3);
    List<Inventory> inventoryList = new ArrayList<>(4);
    private int experience;
    private int currency;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public Player() {

    }

    public Player(String name, int playerId, List<TalentTree> talentTreeList, List<Inventory> inventoryList, int experience, int currency) {
        this.name = name;
        this.playerId = playerId;
        this.talentTreeList = talentTreeList;
        this.inventoryList = inventoryList;
        this.experience = experience;
        this.currency = currency;
    }



}
