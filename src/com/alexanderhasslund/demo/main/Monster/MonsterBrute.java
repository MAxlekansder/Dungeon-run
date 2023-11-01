package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;

public class MonsterBrute extends Monster implements IMonster, ICombat {

    private String monsterName;
    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterBrute() {
        //super("MONSTER - Vermin Ogre", 60,0,20,60,20,13,0,false);
        this.monsterName = "MONSTER - Vermin Ogre";
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
    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
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
    public int getResoruce() {
        return resoruce;
    }

    @Override
    public void setResoruce(int resoruce) {
        this.resoruce = resoruce;
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
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
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
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean dead) {
        isDead = dead;
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

    @Override
    public String toString() {
        return
                Color.PURPLE + monsterName + Color.RESET + ":" +
                        " Hp = " + hp + "  -- " +
                        " Damage = " + damage + "  -- " +
                        " Strength = " + strength + "  -- " +
                        " Agility = " + agility + "  -- " +
                        " Intellect = " + intellect + "  -- " +
                        " Initiative = " + initiative + "  --";
    }
}

