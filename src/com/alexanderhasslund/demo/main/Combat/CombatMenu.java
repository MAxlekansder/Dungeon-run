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
        System.out.println(playerChoice.fightSequence());
        int fightInput = Input.intInput();

        switch (fightInput) {
            case 1 -> {
                //System.out.println("fight");
                System.out.println(playerChoice.abilityChoice());
                fight.fightMonster(playerList, paIT, monsterList, currentPlayer);
                //fight.fightMonster(pla);
                //fight.fightMonster(); vill ha player som argument

            }
            case 2 -> {
                System.out.println("get status");
            }
            case 3 -> {
                System.out.println("flee");
                // calculate if you get away

            }
            default -> {
                System.out.println("use the right input");
            }
        }


    }
}
