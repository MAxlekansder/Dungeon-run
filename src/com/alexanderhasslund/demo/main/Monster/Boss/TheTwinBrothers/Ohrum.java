package com.alexanderhasslund.demo.main.Monster.Boss.TheTwinBrothers;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;

public class Ohrum extends Monster implements IMonster, ICombat {


    public Ohrum() {
        super("\033[1;36mBOSS\033[0m", "THE TWIN BROTHERS - Oh'rum", 80, 0, 7, 0, 60, 0, false, 90, 300, 0, false, 0);
    }

    @Override
    public void spells(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster) {
        //Twin brother pact
        Random random = new Random();
        Monster bossMonster1 = monsterList.get(0);
        Monster bossMonster2 = monsterList.get(1);

        System.out.println("twin brothers pact - with a synchronised lift, both brothers flies into the air, attacks with a symmetrical attack. Stricking at the same time");

        for (Monster monsterSpecial : monsterList) {
            player.setHp(player.getHp() - monster.getDamage() + 2);
            System.out.println(monsterSpecial.getMonsterName() + " Strikes for: " + monsterSpecial.getDamage() + 2);
        }

        System.out.println("THE TWIN BROTHERS REALIGNS WITH THE STARS");

        if (bossMonster1.getHp() > bossMonster2.getHp()) {
            bossMonster2.setHp(bossMonster1.getHp());

            System.out.printf(" TWIN PACT, BLOOD SOUL -  %s draws strength from his brother setting HP to %s\n", bossMonster1.getMonsterName(), bossMonster1.getHp());

        } else if (bossMonster2.getHp() > bossMonster1.getHp()) {
            bossMonster1.setHp(bossMonster2.getHp());
            System.out.printf(" TWIN PACT, BLOOD SOUL -  %s draws strength from his brother setting HP to %s\n", bossMonster2.getMonsterName(), bossMonster2.getHp());
        } else {
            System.out.println("The twin brothers have the same set of HP ");
        }
    }


    @Override
    public void attack(List<Player> playerList, Player currentPlayer, List<Monster> monsterList, Monster currentMonster) {


        Random random = new Random();
        int chanceOfSpell = random.nextInt(12);

        if (chanceOfSpell < 2) {

            int randPlayer = random.nextInt(playerList.size());
            int calculateDodge = random.nextInt(1, 6) * 10;

            int calculatePlayerDodge = playerList.get(randPlayer).getDefence();
            int dodgeChance = calculateDodge + calculatePlayerDodge;
            int scalingDodgeChance = 50 + (int) Math.round(playerList.get(randPlayer).getLevel() * 1.3);


            if (dodgeChance < scalingDodgeChance) {
                System.out.printf("%s, strikes one by one, dealing: %s damage\n", currentMonster.getMonsterName(), currentMonster.getDamage());
                playerList.get(randPlayer).setHp(playerList.get(randPlayer).getHp()
                        - currentMonster.getDamage());
                System.out.printf("And player: %s has %s HP left \n", playerList.get(randPlayer).getName(), playerList.get(randPlayer).getHp());

            } else {

                System.out.printf("%s misses %s player %s \n", currentMonster.getMonsterName(), playerList.get(randPlayer).getClassName(), playerList.get(randPlayer).getName());
            }

        } else {
            spells(playerList, currentPlayer, monsterList, currentMonster);
        }
    }

    @Override
    public void getStatus() {

    }
}
