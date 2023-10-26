package com.alexanderhasslund.demo.main.Classes;

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
        this.resource = 100;
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
}
