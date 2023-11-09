package com.alexanderhasslund.demo.main.Monster.Boss;

public class Boss {

    private String bossName;
    private int damage;
    private int defence;
    private int hp;
    private int resoruce;
    private int initative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;
    private boolean hasPlayed;

    public Boss(String bossName, int damage, int defence, int hp, int resoruce, int initative, int strength, int agility, int intellect, boolean isDead, boolean hasPlayed) {
        this.bossName = bossName;
        this.damage = damage;
        this.defence = defence;
        this.hp = hp;
        this.resoruce = resoruce;
        this.initative = initative;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.isDead = isDead;
        this.hasPlayed = hasPlayed;
    }

    // toString

    // needs getters and setters...

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
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

    public int getInitative() {
        return initative;
    }

    public void setInitative(int initative) {
        this.initative = initative;
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

    public boolean isHasPlayed() {
        return hasPlayed;
    }

    public void setHasPlayed(boolean hasPlayed) {
        this.hasPlayed = hasPlayed;
    }
}

// have a boss that strikes four times in a row - tag team boss
