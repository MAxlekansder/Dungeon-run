package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MonsterAttack {


    public void monsterStrikePlayer( List<Monster> monsterList, List<Player> playerList, Monster currentMonster, Player currentPlayer) {

        System.out.printf("Monster %s turn:\n", currentMonster.getMonsterName());

        IntStream.range(0, monsterList.size()).filter(index -> index == currentMonster.getMonsterId()).forEach(index -> {
            if (currentMonster instanceof ICombat) {
                ((ICombat) currentMonster).attack(playerList, currentPlayer, monsterList, currentMonster);
            }
        });

      currentMonster.setHasPlayed(true);
      checkPlayerhasDied(playerList);
      System.out.println("Press enter to continue: ");
      String enter = Input.stringInput();
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
