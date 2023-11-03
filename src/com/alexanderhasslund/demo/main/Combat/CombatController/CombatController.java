package com.alexanderhasslund.demo.main.Combat.CombatController;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.Collections;
import java.util.List;

public class CombatController {

    private List<Player> playerList;
    private List<Monster> monsterList;

    public CombatController(List<Player> playerList, List<Monster> monsterList) {
        this.playerList = playerList;
        this.monsterList = monsterList;
    }

    public void chanceOfFleeing() {

    }

    public void chanceOfDodge() {

    }

    public void chanceOfBlock() {

    }

    // move this one out????
    public void initiateFight() {
        int countRounds = 0;
        // have a "hasPlayed"? to make it easier to fall through it???

        //this is mock code <- remove this... 
        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }
        Collections.sort(playerList, new PlayerInitiativeComperator());
        Collections.sort(monsterList, new MonsterInitiativeComperator());
        System.out.println("Sorted");
        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }


        while(!playerList.isEmpty() || !monsterList.isEmpty()) {
            countRounds++;
            Collections.sort(playerList, new PlayerInitiativeComperator());
            Collections.sort(monsterList, new MonsterInitiativeComperator());

            //my lists are sorted...
            //compare initiative and use that
            //add it into two lists? i'd rather not...


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
        for (int i = 0; i < playerList.size(); i++) {
            for (int j = 0; j < playerList.get(i).getInventoryList().size(); j++) {
                playerList.get(i).setDefence(playerList.get(i).getDefence()
                        + playerList.get(i).getInventoryList().get(j).getDefence()
                );
            }
        }
    }

    public void calculateMonsterDamage() {
        for(int i = 0; i <monsterList.size();i++) {
            monsterList.get(i).setDamage(monsterList.get(i).getDamage() * playerList.get(i).getLevel());
        }
        // * level
    }



    public void calculateMonsterDefence() {
        for(int i = 0; i <monsterList.size();i++) {
            monsterList.get(i).setDamage(monsterList.get(i).getDamage() * playerList.get(i).getLevel());
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
        for (int i = 0; i < monsterList.size(); i++) {
            if (monsterList.get(i).getHp() <= 0 ) {
                monsterList.get(i).setDead(true);

                playerList.get(i).setCurrency(playerList.get(i).getCurrency() + monsterList.get(i).getGivesCurrency());
                System.out.println(playerList.get(i).getCurrency());
                playerList.get(i).setExperience(playerList.get(i).getExperience() + monsterList.get(i).getGivesExperience());
                System.out.println(playerList.get(i).getExperience());
            }
        }
    }
}
