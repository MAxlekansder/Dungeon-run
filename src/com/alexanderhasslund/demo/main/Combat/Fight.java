package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.List;
import java.util.stream.IntStream;

public class Fight {
    private int countDeadMonsters;

    public int getCountDeadMonsters() {
        return countDeadMonsters;
    }

    public void setCountDeadMonsters(int countDeadMonsters) {
        this.countDeadMonsters = countDeadMonsters;
    }

    private List<Player> playerList;

    public void fightMonster(List<Player> playerList, List<Monster> monsterList, Player currentPlayer, Monster currentMonster) {
        PlayerChoice playerChoice = new PlayerChoice();
        playerChoice.abilityChoice();

        int fightSequence = Input.intInput();
        switch (fightSequence) {

            case 1 -> {
                IntStream.range(0, playerList.size()).filter(index -> index == currentPlayer.getId()).forEach(index -> {  //filter(index -> index == playerIndex)
                            if (currentPlayer instanceof ICombat) {
                                ((ICombat) currentPlayer).attack(playerList, currentPlayer, monsterList, currentMonster);
                            }
                        }
                );
                currentPlayer.setHasPlayed(true);
                checkMonsterhasDied(monsterList,playerList);
            }

            case 2 -> {
                IntStream.range(0, playerList.size()).filter(index -> index == currentPlayer.getId()).forEach(index -> {  //filter(index -> index == playerIndex)
                    if (currentPlayer instanceof ICombat) {
                        ((IClasses) currentPlayer).spells(playerList, currentPlayer, monsterList);
                    }
                });
                currentPlayer.setHasPlayed(true);
                checkMonsterhasDied(monsterList,playerList);
            }
            case 3 -> {
                IntStream.range(0, playerList.size()).filter(index -> index == currentPlayer.getId()).forEach(index -> {  //filter(index -> index == playerIndex)
                    if (currentPlayer instanceof ICombat) {
                    ((IClasses) currentPlayer).trait(playerList, currentPlayer, monsterList);

                    currentPlayer.setHasPlayed(true);
                    checkMonsterhasDied(monsterList,playerList);

                }
            });
            }

            case 4 -> {
                System.out.println("back to menu");
            }
        }
    }


    public void checkMonsterhasDied(List<Monster> monsterList, List<Player> playerList) {
        int giveCurrency = 0;
        int giveExperience = 0;


        for (int i = 0; i < monsterList.size(); i++) {
            countDeadMonsters++;
            if (monsterList.get(i).getHp() <= 0) {


                System.out.printf("\nMonster %s died!\n", monsterList.get(i).getMonsterName());

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

