package com.alexanderhasslund.demo.main.Classes;

import com.alexanderhasslund.demo.main.Player.Player;

public class Rogue extends Player implements IClasses{

    private String className;
    private int id;
    private int hp;
    private int damage;
    private int resource;
    private int strength;
    private int agility;
    private int intellect;
    private int level;
    private int evasion;
    private int initative;

    public Rogue() {
        this.className = "ROGUE";
        this.id = 2;
        this.hp = 100;
        this.damage = 15;
        this.resource = 200;
        this.strength = 8;
        this.agility = 20;
        this.intellect = 2;
        this.level = 1;
        this.evasion = 1;
        this.initative = 40;
    }

    @Override
    public void trait() {
        //fools elusiveness
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
}
