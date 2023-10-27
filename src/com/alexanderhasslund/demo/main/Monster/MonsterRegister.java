package com.alexanderhasslund.demo.main.Monster;

import java.util.ArrayList;
import java.util.List;

public class MonsterRegister {

    List<Monster> monsterList = new ArrayList<>();

    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterRegister(int hp, int resoruce, int damage, int initiative, int strength, int agility, int intellect, boolean isDead) {
        this.hp = hp;
        this.resoruce = resoruce;
        this.damage = damage;
        this.initiative = initiative;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.isDead = isDead;
    }
}
