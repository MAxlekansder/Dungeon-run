package com.alexanderhasslund.demo.main.Monster;

public class MonsterSpellWeaver implements IMonster {

    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterSpellWeaver(int initiative, int level) {
        this.hp = 60;
        this.resoruce = 0;
        this.damage = 20 * level;
        this.initiative = 80;
        this.strength = 20 ;
        this.agility = 13;
        this.intellect = 20;
        this.isDead = false;
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public void spells() {

    }
}
