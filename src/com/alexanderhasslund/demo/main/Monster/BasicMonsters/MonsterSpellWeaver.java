package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.IMonster;

public class MonsterSpellWeaver extends Monster implements IMonster, ICombat {


    public MonsterSpellWeaver() {
        super("MONSTER - Vermin Spellweaver", 50,0,20,80,0,13,20,false,25,30,5,false);

    }

    @Override
    public void spells() {
        //spell fireball
    }

    @Override
    public void damageMultiplierForLevel() {

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


}
