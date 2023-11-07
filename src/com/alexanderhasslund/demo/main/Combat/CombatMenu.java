package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Engine.Input;

import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.List;

public class CombatMenu {


    public void combatSwitch(List<Player> playerList, int paIT, List<Monster> monsterList, Player currentPlayer) {
        PlayerChoice playerChoice = new PlayerChoice();
        Fight fight = new Fight();
        System.out.printf("Player %s turn:\n", currentPlayer.getName());

        int fightInput = 0;
        boolean isFighting = true;
        boolean isViewing = true;

        while (isFighting) {
            isViewing = true;
            while (isViewing) {
                System.out.println(playerChoice.fightSequence());
                fightInput = Input.intInput();
                switch (fightInput) {
                    case 1 -> {
                        //System.out.println("fight");
                        System.out.println(playerChoice.abilityChoice());
                        fight.fightMonster(playerList, paIT, monsterList, currentPlayer);
                        //fight.fightMonster(pla);
                        //fight.fightMonster(); vill ha player som argument
                        isFighting = false;
                        isViewing = false;

                    }
                    case 2 -> {
                        System.out.println("get status");
                        getStatusActivePlayerAndMosnter(playerList, monsterList);
                        isViewing = false;
                    }
                    case 3 -> {
                        System.out.println("flee");
                        Flee flee = new Flee();
                        flee.chanceOfFleeing(monsterList);
                        // calculate if you get away
                        // take flase or break into next step

                    }
                    default -> {
                        System.out.println("use the right input");
                    }
                }
            }
        }
    }

    public void getStatusActivePlayerAndMosnter(List<Player> playerList, List<Monster> monsterList) {
        for (Player player : playerList) {
            System.out.println(
                    player.getClassName()
                    + " || Player = " +player.getName()
                    + " || HP = " + player.getHp()
                    + " || Resource = " + player.getResource()
                    + " || Damage = " + player.getDamage()
                    + " || Defence = " + player.getDefence()
                    + " || Initiative = " + player.getInitiative()
            );
        }

        for (Monster monster : monsterList) {
            System.out.println(
                    monster.getMonsterName()
                    + " -- HP = " + monster.getHp()
                    + " -- ID = " + (monster.getMonsterId() +1)
                    + " -- Damage = " + monster.getDamage()
                    + " -- Defence = "  + monster.getDefence()
                    + " -- Initiative = "  + monster.getInitiative());
        }
    }
}
