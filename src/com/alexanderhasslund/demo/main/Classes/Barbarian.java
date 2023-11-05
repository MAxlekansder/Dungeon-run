package com.alexanderhasslund.demo.main.Classes;
import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Player.Player;


public class Barbarian extends Player implements IClasses, ICombat {

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
    private boolean isDead;
    private boolean hasPlayed;


    public Barbarian() {
        //Player barbarian = new Player(getName(),getTalentTreeList(),getInventoryList(),0,0,"BARBARIAN",115,20,100,22,8,0,0,10,55);
        //return barbarian;
        this.className = Color.RED + "BARBARIAN" + Color.RESET;
        this.hp = 115;
        this.id = 0;
        this.damage = 20;
        this.resource = 100;
        this.strength = 22;
        this.agility = 8;
        this.intellect = 0;
        this.level = 1;
        this.defence = 1;
        this.initiative = 55;
        this.isDead = false;
        this.hasPlayed = false;
    }

    @Override
    public void trait() {
        //berserkers rage
        //when hp is below 30 <- activate berserkers rage

        if ( hp <= hp * 0.3) {
            System.out.println("The barbarian gains berserker rage, gaining extra damage");
            while (hp <= hp * 0.3) {
                damage += (int) (damage * 0.07);
            }
        }
    }


    @Override
    public int spells() {
        int temporaryBuffs = 0;
        switch (1) {
            case 1 -> { // a baseline damage spell that adds 3 damage and uses 'resources'
                temporaryBuffs = (int) (Math.ceil(damage) + ( 3 * level^level/4));
                System.out.println("Cleaves the target with: " + temporaryBuffs);
                resource -= 20;
            }
            case 2 -> { //
                System.out.println( "The barbarian muster its rage, gaining defence euqal to: " + (defence + 2));
                resource -= 30;
                temporaryBuffs += 2;
            }
            default -> {System.out.println("Use right input");}
        }
        return temporaryBuffs;
    }


    @Override
    public void setLevelUp() {

    }

    @Override
    public void attack() {
        System.out.println("in attack for barb");

    }

    @Override
    public void flee() {

    }

    @Override
    public void getStatus() {

    }

    @Override
    public String toString() {
        return
                Color.RED + className + Color.RESET + ":" +
                        " Hp = " + hp + "  || " +
                        " Damage = " + damage + "  || " +
                        " Resource = " + resource + "  || " +
                        " Strength = " + strength + "  || " +
                        " Agility = " + agility + "  || " +
                        " Intellect = " + intellect + "  || " +
                        " Initiative = " + initiative + "  ||";
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

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
