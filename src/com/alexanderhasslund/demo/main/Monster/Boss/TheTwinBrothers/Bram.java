package com.alexanderhasslund.demo.main.Monster.Boss.TheTwinBrothers;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;

public class Bram extends Monster implements IMonster, ICombat {

    public Bram() {
        super("\033[1;36mBOSS\033[0m","THE TWIN BROTHERS - Bram",80,0,7,0,40,0,false,90,200,0,false,0);
    }

    @Override
    public void attack(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster) {

    }

    @Override
    public void getStatus() {

    }

    @Override
    public void spells(List<Player> playerList, Player currentPlayer, List<Monster> monsterList, Monster currentMonster) {

        Random random = new Random();
        int chanceOfSpell = random.nextInt(10);

        if (chanceOfSpell < 2) {

            int randPlayer = random.nextInt(playerList.size());
            int calculateDodge = random.nextInt(1, 6) * 10;

            int calculatePlayerDodge = playerList.get(randPlayer).getDefence();
            int dodgeChance = calculateDodge + calculatePlayerDodge;
            int scalingDodgeChance = 50 + (int) Math.round(playerList.get(randPlayer).getLevel() * 1.3);


            if (dodgeChance < scalingDodgeChance) {
                System.out.println("The Tag team, strikes one by one, dealing: " + currentMonster.getDamage() + " damage");
                playerList.get(randPlayer).setHp(playerList.get(randPlayer).getHp()
                        - currentMonster.getDamage());
                System.out.printf("And player: %s has %s HP left \n", playerList.get(randPlayer).getName(), playerList.get(randPlayer).getHp());

            } else {

                System.out.printf("The Tag team misses %s player %s \n", playerList.get(randPlayer).getClassName(), playerList.get(randPlayer).getName());
            }

        } else {
            spells(playerList, currentPlayer, monsterList, currentMonster);
        }

    }
}
