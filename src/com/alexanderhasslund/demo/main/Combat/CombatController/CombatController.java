package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Combat.CombatMenu;
import com.alexanderhasslund.demo.main.Combat.Fight;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombatController {

    private List<Player> playerList;
    private int countPlayer;


    public CombatController(List<Player> playerList, int countPlayer) {
        this.playerList = playerList;
        this.countPlayer = countPlayer;

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
    public void initiateFight(List<Monster> monsterList) {
        PlayerChoice playerChoice = new PlayerChoice();
        CombatMenu combatMenu = new CombatMenu();

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
        while (!playerList.isEmpty() || !monsterList.isEmpty()) {
            Collections.sort(playerList, new PlayerInitiativeComperator());
            Collections.sort(monsterList, new MonsterInitiativeComperator());

            //       0          <= 1+3 = 4
            // check after every round and reset??
            // insert a break if player flee
            while (!(checkPlayerHasPLayed(playerList) && checkMonsterHasPLayed(monsterList))) {

                    // false
                if (!(playerList.get(paIT).isHasPlayed())) {


                    if (playerList.get(paIT).isHasPlayed() == false && playerList.get(paIT).getInitiative() < (monsterList.get(moIT).getInitiative()) && monsterList.get(moIT).isHasPlayed() == false) {

                        System.out.printf("Player %s turn: \n", playerList.get(paIT).getName());
                        System.out.println(playerChoice.fightSequence());

                        combatMenu.combatSwitch(playerList, paIT, monsterList);

                        playerList.get(paIT).setHasPlayed(true);
                        System.out.println(playerList.get(paIT).isHasPlayed());
                        if (paIT < playerList.size() - 1) paIT++;

                    } else {

                        System.out.printf("Monster %s:", monsterList.get(moIT).getMonsterName());


                        monsterList.get(moIT).setHasPlayed(true);
                        System.out.println(monsterList.get(paIT).isHasPlayed());
                        if (moIT < monsterList.size() - 1) moIT++;
                    }

                } else {
                    System.out.printf("Monster %s turn", monsterList.get(moIT).getMonsterName());
                    monsterList.get(moIT).setHasPlayed(true);
                    System.out.println(monsterList.get(paIT).isHasPlayed());
                    if (moIT < monsterList.size() - 1) moIT++;
                }

            }

            System.out.println("end of first round");
            for (Player player : playerList) {
                player.setHasPlayed(false);
            }

            for (Monster monster : monsterList) {
                monster.setHasPlayed(false);
            }

            countRounds++;
            paIT = 0;
            moIT = 0;

            // reset initiativeTracker here??? as thing dies, list will shrink
            // tracker might be a dumb idea here...
            // how do i by the best find the index...

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