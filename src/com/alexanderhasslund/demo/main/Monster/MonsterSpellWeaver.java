package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;

public class MonsterSpellWeaver extends Monster implements IMonster, ICombat {


    public MonsterSpellWeaver() {
        super("MONSTER - Vermin Spellweaver", 50,0,20,80,0,13,20,false);

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


}
