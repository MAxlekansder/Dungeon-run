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
        this.className = Color.BLUE + "SORCERER" + Color.RESET;
        this.hp = 80;
        this.id = 0;
        this.damage = 10; //find a good formula;
        this.resource = 150;
        this.strength = 3;
        this.agility = 5;
        this.intellect = 22;
        this.level = 1;
        this.initative = 70;
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
    public void trait() {
        //Dragons breath
        //Based on how many targets it will cleave
        //Find a good way to work this out, but first we need to add all monsters and then split
        //damage * some trait / array.size() == all monster in Array

        //Cooldown
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

    public int getInitative() {
        return initative;
    }

    public void setInitative(int initative) {
        this.initative = initative;
    }

    @Override
    public int spells() {
        switch (1){
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
