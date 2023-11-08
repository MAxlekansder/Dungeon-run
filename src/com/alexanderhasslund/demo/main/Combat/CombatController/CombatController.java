package com.alexanderhasslund.demo.main.Combat.CombatController;
import com.alexanderhasslund.demo.main.Combat.CombatMenu;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class CombatController {

    private List<Player> playerList;
    private List<Monster> monsterList;
    private int calculateLevels;

    public int getCalculateLevels() {
        return calculateLevels;
    }

    public void setCalculateLevels(int calculateLevels) {
        this.calculateLevels = calculateLevels;
    }

    public CombatController(List<Player> playerList, List<Monster> monsterList) {
        this.playerList = playerList;
        this.monsterList = monsterList;
    }


    // move this one out????
    // -- return boolean to break isPlaying -> easier to handle
    public void initiateFight() {
        CombatEndingController combatEndingController = new CombatEndingController();
        CombatMenu combatMenu = new CombatMenu();
        MonsterAttack monsterAttack = new MonsterAttack();

        Collections.sort(playerList, new PlayerInitiativeComperator());
        Collections.sort(monsterList, new MonsterInitiativeComperator());

        checkCombatSorted(playerList, monsterList);
        System.out.println("Enter to start combat ");
        String enter = Input.stringInput();

        int countRounds = 0;

        while (!(playerList.isEmpty() || monsterList.isEmpty())) {
            Collections.sort(playerList, new PlayerInitiativeComperator());
            Collections.sort(monsterList, new MonsterInitiativeComperator());

            while (!(checkPlayerHasPLayed(playerList) && checkMonsterHasPLayed(monsterList))) {

                if (playerList.isEmpty() || monsterList.isEmpty()) {
                    break;

                } else {

                    Player currentPlayer = playerList.stream().filter(player -> !player.isHasPlayed()).findFirst().orElse(null);
                    Monster currentMonster = monsterList.stream().filter(monster -> !monster.isHasPlayed()).findFirst().orElse(null);


                    if (currentMonster == null) {

                        combatMenu.combatSwitch(playerList, monsterList, currentPlayer, currentMonster);
                        break;

                    } else if (currentPlayer == null) {

                        monsterAttack.monsterStrikePlayer( monsterList, playerList, currentMonster, currentPlayer);
                        break;

                    } else {

                        if (currentPlayer.getInitiative() < currentMonster.getInitiative()) {

                            combatMenu.combatSwitch(playerList,  monsterList, currentPlayer, currentMonster);

                        } else {

                            monsterAttack.monsterStrikePlayer(monsterList, playerList, currentMonster, currentPlayer);

                        }
                    }
                }
            }
            countRounds++;

            System.out.printf("\nend of round  %s \n", countRounds);

            resetPlayerInitiative();

            resetMonsterInitiative(monsterList);

        }
        calculateLevels++;
        combatEndingController.decideCombatWinner(playerList, calculateLevels);
        enter = Input.stringInput();
    }


    public void resetPlayerInitiative() {
        for (Player player : playerList) {
            player.setHasPlayed(false);
        }
    }

    // move these out?
    public void resetMonsterInitiative(List<Monster> monsterList) {
        for (Monster monster : monsterList) {
            monster.setHasPlayed(false);
        }
    }


    public boolean checkMonsterHasPLayed(List<Monster> monsterList) {

        for (Monster monster : monsterList) {
            if (!monster.isHasPlayed()) {
                return false;
            }
        }
        return true;
    }


    public boolean checkPlayerHasPLayed(List<Player> playerList) {

        for (Player player : playerList) {
            if (!player.isHasPlayed()) {
                return false;
            }
        }
        return true;
    }


    public void checkCombatSorted(List<Player> playerList, List<Monster> monsterList) {
        InitiativeListView initiativeListView = new InitiativeListView();

        initiativeListView.presentInitiative(playerList, monsterList);


        Collections.sort(, new WindowInitiativComperator());
        for(Object object : tempList){
            System.out.println(object);
            object.
        }
        System.out.println("----");



    }
}

