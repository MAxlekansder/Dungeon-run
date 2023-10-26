package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.TalentTree.TalentTree;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int id;
    List<IClasses> playerClass = new ArrayList<>(1);
    List<TalentTree> talentTreeList = new ArrayList<>(3);
    List<Inventory> inventoryList = new ArrayList<>(4);
    private int experience;
    private int currency;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {

    }
    public Player(String name, int id, List<IClasses> playerClass, List<TalentTree> talentTreeList, List<Inventory> inventoryList, int experience, int currency) {
        this.name = name;
        this.id = id;
        this.playerClass = playerClass;
        this.talentTreeList = talentTreeList;
        this.inventoryList = inventoryList;
        this.experience = experience;
        this.currency = currency;
    }

}
