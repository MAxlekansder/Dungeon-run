package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Engine.Input;

import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.List;

public class CombatMenu {


    public void combatSwitch(List<Player> playerList, int paIT, List<Monster> monsterList) {
        PlayerChoice playerChoice = new PlayerChoice();
        Fight fight = new Fight();

        int fightInput = Input.intInput();
        System.out.println(playerChoice.fightSequence());
        switch (fightInput) {
            case 1 -> {
                //System.out.println("fight");
                System.out.println(playerChoice.abilityChoice());
                fight.fightMonster(playerList, paIT, monsterList);
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
