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
        this.className = Color.GREEN + "ROGUE" + Color.RESET;
        this.hp = 100;
        this.id = 0;
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
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getResource() {
        return resource;
    }

    @Override
    public void setResource(int resource) {
        this.resource = resource;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public int getIntellect() {
        return intellect;
    }

    @Override
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
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
