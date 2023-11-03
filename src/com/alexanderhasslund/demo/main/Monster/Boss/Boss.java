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

}

// have a boss that strikes four times in a row - tag team boss
