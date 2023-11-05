package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;

public class MonsterRanger extends Monster implements IMonster, ICombat {



    public MonsterRanger() {
        super("VERMIN GUNSLINGER", 60,0,20,20,13,0,false,30,20,10, false, 0);
    }

    @Override
    public void spells() {
        //shoot ranged

    }

    @Override
    public void damageMultiplierForLevel() {

    }


    @Override
    public void attack(List<Player> playerList, int playerIndex, List<Monster> monsterList) {
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
