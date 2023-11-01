package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Player.Player;

public class MonsterRanger extends Monster implements IMonster, ICombat {


    public MonsterRanger() {
        super("MONSTER - Vermin Gunslinger", 60,0,20,40,20,13,0,false);

    }

    

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public void spells() {
        //shoot ranged

    }


    @Override
    public void attack() {
        System.out.println("The ranger shoots for: ");

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
