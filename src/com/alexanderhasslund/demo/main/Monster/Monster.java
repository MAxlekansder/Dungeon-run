package com.alexanderhasslund.demo.main.Monster;

public class Monster {

    private String monsterName;
    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;



    public String getMonsterName() {
        return monsterName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getResoruce() {
        return resoruce;
    }

    public void setResoruce(int resoruce) {
        this.resoruce = resoruce;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    /*
    public Monster(String monsterName, int hp, int resoruce, int damage, int initiative, int strength, int agility, int intellect, boolean isDead) {
        this.monsterName = monsterName;
        this.hp = hp;
        this.resoruce = resoruce;
        this.damage = damage;
        this.initiative = initiative;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.isDead = isDead;
    } */
}
