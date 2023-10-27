package com.alexanderhasslund.demo.main.Classes;

import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Player.Player;

public class Sorcerer extends Player implements IClasses{

    private String className;
    private int id;
    private int hp;
    private int damage;
    private int resource;
    private int strength;
    private int agility;
    private int intellect;
    private int level;
    private int initative;

    public Sorcerer() {
        this.className = "SORCERER";
        this.id = 3;
        this.hp = 80;
        this.damage = 10; //find a good formula;
        this.resource = 150;
        this.strength = 3;
        this.agility = 5;
        this.intellect = 22;
        this.level = 1;
        this.initative = 70;
    }


    @Override
    public void trait() {
        //Dragons breath
    }

    @Override
    public int spells(int choice) {
        switch (choice){
            case 1 -> {}
            case 2 -> {}
            default -> {System.out.println("Use right input");}
        }
        return 2;
    }

    @Override
    public void setLevelUp() {

    }

    @Override
    public String toString() {
        return
                Color.BLUE+ className + Color.RESET + ":" +
                "  Hp = " + hp + "   || " +
                " Damage = " + damage + "  || " +
                " Resource = " + resource + "  || " +
                " Strength = " + strength + "  || " +
                " Agility = " + agility + "  || " +
                " Intellect = " + intellect + "  || " +
                " Initiative = " + initative + "  ||";
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public int getInitative() {
        return initative;
    }

    public void setInitative(int initative) {
        this.initative = initative;
    }
}
