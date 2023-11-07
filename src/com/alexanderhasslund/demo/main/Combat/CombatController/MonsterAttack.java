package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MonsterAttack {


    public void monsterStrikePlayer(int monsterIndex, List<Monster> monsterList, List<Player> playerList, Monster monster) {

        System.out.printf("Monster %s turn:\n", monsterList.get(monsterIndex).getMonsterName());

        IntStream.range(0, monsterList.size()).filter(index -> index == monsterIndex).forEach(index -> {
            if (monster instanceof ICombat) {
                ((ICombat) monster).attack(playerList, monsterIndex, monsterList);
            }
        });

      monster.setHasPlayed(true);
      checkPlayerhasDied(playerList);

    }


    public void checkPlayerhasDied(List<Player> playerList) {
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).getHp() <= 0) {
                System.out.printf("Seems like player %s didnt, survive... to bad...", playerList.get(i).getName());
                playerList.get(i).setHasPlayed(true);
                playerList.remove(i);

            }
        }
    }
}
