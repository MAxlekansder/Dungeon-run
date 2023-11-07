package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.List;
import java.util.stream.IntStream;

public class Fight {

    private List<Player> playerList;

    public void fightMonster(List<Player> playerList, int playerIndex, List<Monster> monsterList, Player currentPlayer) {
        PlayerChoice playerChoice = new PlayerChoice();
        playerChoice.abilityChoice();

        int fightSequence = Input.intInput();
        switch (fightSequence) {

            case 1 -> {
                IntStream.range(0, playerList.size()).filter(index -> index == playerIndex).forEach(index -> {
                            if (currentPlayer instanceof ICombat) {
                                ((ICombat) currentPlayer).attack(playerList, playerIndex, monsterList);
                            }
                        }
                );
                currentPlayer.setHasPlayed(true);
                checkMonsterhasDied(monsterList,playerList);
            }

            case 2 -> {
                IntStream.range(0,playerList.size()).filter(index -> index == playerIndex).forEach(index -> {
                    if (currentPlayer instanceof IClasses) {
                        ((IClasses) currentPlayer).spells(playerList, playerIndex, monsterList);
                    }
                });
                currentPlayer.setHasPlayed(true);
                checkMonsterhasDied(monsterList,playerList);
            }

            case 3 -> {
                System.out.println("back to menu");
            }
        }
    }


    public void checkMonsterhasDied(List<Monster> monsterList, List<Player> playerList) {
        int giveCurrency = 0;
        int giveExperience = 0;

        for (int i = 0; i < monsterList.size(); i++) {
            if (monsterList.get(i).getHp() <= 0) {


                System.out.printf("\nMonster %s died!", monsterList.get(i).getMonsterName());

                giveCurrency = (int) monsterList.get(i).getGivesCurrency() / playerList.size();
                giveExperience = (int) monsterList.get(i).getGivesExperience() / playerList.size();

                for (int j = 0; j < playerList.size(); j++) {

                    playerList.get(j).setCurrency(giveCurrency);
                    playerList.get(j).setExperience(giveExperience);
                }
                monsterList.remove(i);
            }
        }
    }
}

