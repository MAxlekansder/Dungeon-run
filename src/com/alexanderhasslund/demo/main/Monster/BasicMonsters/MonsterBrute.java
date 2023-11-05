package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;

import java.util.Random;


public class MonsterBrute extends Monster implements IMonster, ICombat {



    public MonsterBrute() {
        super("VERMIN OGRE", 60,0,20,20,13,0,false, 30,20,20, false);

    }




    //randomize initiative within bound?
    @Override
    public void spells() {
        //slams

    }

    @Override
    public void damageMultiplierForLevel() {

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

