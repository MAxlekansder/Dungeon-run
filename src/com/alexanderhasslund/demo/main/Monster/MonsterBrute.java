package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;

public class MonsterBrute extends Monster implements IMonster, ICombat {

    public MonsterBrute() {
        super("MONSTER - Vermin Ogre", 60,0,20,60,20,13,0,false);
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

