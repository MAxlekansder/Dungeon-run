package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Player.Player;

public class MonsterRanger implements IMonster {

    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterRanger() {
        this.hp = 60;
        this.resoruce = 0;
        this.damage = 20;
        this.initiative = 40;
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

    }


}
