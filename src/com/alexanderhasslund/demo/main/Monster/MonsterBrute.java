package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;

public class MonsterBrute extends Monster implements IMonster, ICombat {

    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterBrute() {
        this.hp = 60;
        this.resoruce = 0;
        this.damage = 20 ;
        this.initiative = 60;
        this.strength = 20;
        this.agility = 13;
        this.intellect = 0;
        this.isDead = false;
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public void spells() {
        //slams

    }

    @Override
    public void attack() {
        System.out.println("The brute hits for: ");

    }

    @Override
    public void flee() {
        // end combat and release, release all or just this class?
        // if monster leaves, brute enrages?

    }

    @Override
    public void getStatus() {

    }
}

