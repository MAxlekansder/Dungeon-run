package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;

public class MonsterSpellWeaver extends Monster implements IMonster, ICombat {


    public MonsterSpellWeaver() {
        super("VERMIN SPELLWEAVER", 50,0,20,0,13,20,false,25,30,5,false,0);

    }

    @Override
    public void spells() {
        //spell fireball
    }

    @Override
    public void damageMultiplierForLevel() {

    }

    @Override
    public void attack(List<Player> playerList, Player currentPlayer, List<Monster> monsterList,  Monster currentMonster) { //insert attack modifiers here?

        System.out.println("The spellweaver hits for: " + currentMonster.getDamage() + " damage");
        Random random = new Random();

        int randPlayer = random.nextInt(playerList.size());

        playerList.get(randPlayer).setHp(playerList.get(randPlayer).getHp()
                - currentMonster.getDamage());

        System.out.printf("And player: %s has %s HP left \n", playerList.get(randPlayer).getName(), playerList.get(randPlayer).getHp());

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
