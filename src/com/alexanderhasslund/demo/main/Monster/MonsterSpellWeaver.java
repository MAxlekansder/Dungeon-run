package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;

public class MonsterSpellWeaver extends Monster implements IMonster, ICombat {

    private String monsterName;
    private int hp;
    private int resoruce;
    private int damage;
    private int initiative;
    private int strength;
    private int agility;
    private int intellect;
    private boolean isDead;

    public MonsterSpellWeaver() {
        //super("MONSTER - Vermin Spellweaver", 50,0,20,80,0,13,20,false);
        this.monsterName = "MONSTER - Skaven Spellweaver";
        this.hp = 60;
        this.resoruce = 0;
        this.damage = 20;
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
        //spell fireball
    }

    @Override
    public void attack() { //insert attack modifiers here?
        System.out.println("The spellweaver hits for: ");
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
