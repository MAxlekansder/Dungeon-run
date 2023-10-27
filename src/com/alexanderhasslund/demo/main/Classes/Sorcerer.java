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
        //Based on how many targets it will cleave
        //Find a good way to work this out, but first we need to add all monsters and then split
        //damage * some trait / array.size() == all monster in Array

        //Cooldown
    }

    @Override
    public int spells(int choice) {
        switch (choice){
            case 1 -> {
                System.out.println("builds up damage over time, over three rounds: ");
            }
            case 2 -> {
                System.out.println("The sorcerer cocoons it self, soaks all incoming harm");
            }
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

}
