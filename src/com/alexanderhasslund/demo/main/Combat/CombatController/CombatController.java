package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Combat.CombatMenu;
import com.alexanderhasslund.demo.main.Combat.Fight;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class CombatController {

    private List<Player> playerList;
    private List<Monster> monsterList;
    private int countPlayer;


    public CombatController(List<Player> playerList, int countPlayer, List<Monster> monsterList) {
        this.playerList = playerList;
        this.countPlayer = countPlayer;
        this.monsterList = monsterList;

    }

    public void chanceOfFleeing() {

        // calculate and use this for entire party but monster can flee one by one
        // maybe brute shouldn't be able to flee

    }

    public void chanceOfDodge() {
        // maybe just for rogue...
    }

    public void chanceOfBlock() {

    }

    // move this one out????
    public void initiateFight() {
        PlayerChoice playerChoice = new PlayerChoice();
        CombatMenu combatMenu = new CombatMenu();
        MonsterAttack monsterAttack = new MonsterAttack();

        Collections.sort(playerList, new PlayerInitiativeComperator());
        Collections.sort(monsterList, new MonsterInitiativeComperator());

        System.out.println("\nSorted");

        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i));
        }
        System.out.println(" ");
        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(monsterList.get(i));
        }
        // kika på den här, blir lite onödig
        //MonsterController monsterController = new MonsterController(countPlayer);
        //monsterController.monsterValueController();
        int countRounds = 0;
        // have a "hasPlayed"? to make it easier to fall through it???

        //this is mock code <- remove this...


        int paIT = 0; // player InitiativeTracker
        int moIT = 0; // monster InitiativeTracker
        /*
        boolean checkPlayerHasPlayed = true;
        boolean checkMonsterHasPlayed = true;
        while (checkPlayerHasPlayed && checkMonsterHasPlayed) */
        // insert a break if player flees
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

                        combatMenu.combatSwitch(playerList, paIT, monsterList, currentPlayer);
                        break;

                    } else if (currentPlayer == null) {

                        monsterAttack.monsterStrikePlayer(moIT, monsterList, playerList, currentMonster);
                        break;

                    } else {

                        if (currentPlayer.getInitiative() < currentMonster.getInitiative()) {

                            combatMenu.combatSwitch(playerList, paIT, monsterList, currentPlayer);

                        } else {

                            monsterAttack.monsterStrikePlayer(moIT, monsterList, playerList, currentMonster);

                        }
                    }
                }
            }

            countRounds++;
            System.out.printf("end of %s  round \n", countRounds);

            resetPlayerInitiative();

            resetMonsterInitiative(monsterList);
            System.out.println("Outside of first while loop - isEmpty");
        }
    }



    public void resetPlayerInitiative() {
        for (Player player : playerList) {
            player.setHasPlayed(false);
        }
    }


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
}

/*

    public void checkBothListsAndSort() {

        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }
        System.out.println(" ");
        for(int i = 0; i < monsterList.size();i++) {
            System.out.println(monsterList.get(i));
        }
        Collections.sort(playerList, new PlayerInitiativeComperator());
        Collections.sort(monsterList, new MonsterInitiativeComperator());

        System.out.println("\nSorted");

        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }
        System.out.println(" ");
        for(int i = 0; i < monsterList.size();i++) {
            System.out.println(monsterList.get(i));
        }
    }



    //Flytta ut dessa?

    // kika lite på den här... är väldigt osäker på hur jag ska räkna? Tippar på att göra playersize...
    public void calculatePlayerDamage() {

        for (int i = 0; i < playerList.size(); i++) {
            for (int j = 0; j < playerList.get(i).getInventoryList().size(); j++) {
                playerList.get(i).setDamage(playerList.get(i).getDamage()
                        + playerList.get(i).getInventoryList().get(j).getDamage()
                );
            }
        }
    }

    public void calculatePlayerDefence() {
        MonsterController monsterController = new MonsterController(countPlayer);
        for (int i = 0; i < playerList.size(); i++) {
            for (int j = 0; j < playerList.get(i).getInventoryList().size(); j++) {
                playerList.get(i).setDefence(playerList.get(i).getDefence()
                        + playerList.get(i).getInventoryList().get(j).getDefence()
                );
            }
        }
    }

    public void calculateMonsterDamage() {
        MonsterController monsterController = new MonsterController(countPlayer);
        for(int i = 0; i < monsterController.getMonsterList().size();i++) {
            monsterController.getMonsterList().get(i).setDamage(monsterController.getMonsterList().get(i).getDamage() * playerList.get(i).getLevel());
        }
        // * level
    }



    public void calculateMonsterDefence() {
        MonsterController monsterController = new MonsterController(countPlayer);
        for(int i = 0; i <monsterController.getMonsterList().size();i++) {
            monsterController.getMonsterList().get(i).setDamage(monsterController.getMonsterList().get(i).getDamage() * playerList.get(i).getLevel());
        }// * level

    }



    public void playerDied() {

        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).getHp() <= 0 ) {
            playerList.get(i).setDead(true);
            }
        }
    }

    public void monsterDied() {
        MonsterController monsterController = new MonsterController(countPlayer);
        for (int i = 0; i < monsterController.getMonsterList().size(); i++) {
            if (monsterController.getMonsterList().get(i).getHp() <= 0 ) {
                monsterController.getMonsterList().get(i).setDead(true);

                playerList.get(i).setCurrency(playerList.get(i).getCurrency() + monsterController.getMonsterList().get(i).getGivesCurrency());
                System.out.println(playerList.get(i).getCurrency());
                playerList.get(i).setExperience(playerList.get(i).getExperience() + monsterController.getMonsterList().get(i).getGivesExperience());
                System.out.println(playerList.get(i).getExperience());
            }
        }
    }

}


// attack is raw damage, should be calc with:
// damage + str
// damage + agi
// damage + int

//maybe get this into the interface, so it's controlled by the class

// defence should just reduce damage taken, find formula for how to calculate it
// block is raw damage mitigation <- if monk class is introduced shield would block entire damage
// dodge should only be rogue "defence = evasion..."

*/