package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.TalentTree.TalentTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {

    private String name;
    private int playerId;
    List<TalentTree> talentTreeList = new ArrayList<>(3);
    List<Inventory> inventoryList = new ArrayList<>(4);
    private int experience;
    private int currency;

    private String className;
    private int id;
    private int hp;
    private int damage;
    private int resource;
    private int strength;
    private int agility;
    private int intellect;
    private int level;
    private int defence;
    private int initiative;








    public String getClassName() {
        return className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

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

    public List<TalentTree> getTalentTreeList() {
        return talentTreeList;
    }

    public void setTalentTreeList(List<TalentTree> talentTreeList) {
        this.talentTreeList = talentTreeList;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public Player() {

    }

    public Player(String name, int id, List<TalentTree> talentTreeList, List<Inventory> inventoryList, int experience, int currency, String className, int hp, int damage, int resource, int strength, int agility, int intellect, int level, int defence, int initiative) {
        this.name = name;
        this.id = id;
        this.talentTreeList = talentTreeList;
        this.inventoryList = inventoryList;
        this.experience = experience;
        this.currency = currency;
        this.className = className;
        this.hp = hp;
        this.damage = damage;
        this.resource = resource;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.level = level;
        this.defence = defence;
        this.initiative = initiative;
    }
}
