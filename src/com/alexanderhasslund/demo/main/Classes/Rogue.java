package com.alexanderhasslund.demo.main.Classes;

import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Player.Player;

public class Rogue extends Player implements IClasses {

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
    private int initiative;

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
        this.initiative = 40;
    }


    @Override
    public void trait() {
        //When struck in combat you have a chance to dodge the attack, multiplies evasion
        //fools elusiveness
        //count number of rounds and try to get it in here so there's a chance to use the trait
        // maybe put the for loop for rounds in the fighting sequence and not in the spell?

        evasion *= evasion * 2;

        //Cooldown
    }

    @Override
    public int spells(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.printf("Backstabs the target, dealing: %s extra damage and gaining: %s extra evasion", 3, 2);
            }
            case 2 -> {
                System.out.printf("Pick pockets the target gaining: %s gold", 1);
            }
            default -> {
                System.out.println("Use right input");
            }
        }
        return 2;
    }

    @Override
    public void setLevelUp() {

    }

    @Override
    public String toString() {
        return
                Color.GREEN + className + Color.RESET + ":" +
                        "     Hp = " + hp + "  || " +
                        " Damage = " + damage + "  || " +
                        " Resource = " + resource + "  || " +
                        " Strength = " + strength + "  || " +
                        " Agility = " + agility + "  || " +
                        " Intellect = " + intellect + "  || " +
                        " Initiative = " + initiative + "  ||";
    }

}
