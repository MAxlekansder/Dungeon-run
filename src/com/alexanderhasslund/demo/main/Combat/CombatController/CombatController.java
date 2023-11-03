package com.alexanderhasslund.demo.main.Combat.CombatController;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.Collections;
import java.util.List;

public class CombatController {

    private List<Player> playerList;
    private int countPlayer;
    //private List<Monster> monsterList;

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
    public void initiateFight() {

        // kika på den här, blir lite onödig
        MonsterController monsterController = new MonsterController(countPlayer);
        monsterController.monsterValueController();
        int countRounds = 0;
        // have a "hasPlayed"? to make it easier to fall through it???

        //this is mock code <- remove this...



        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }
        System.out.println(" ");
        for(int i = 0; i < monsterController.getMonsterList().size();i++) {
            System.out.println(monsterController.getMonsterList().get(i));
        }
        Collections.sort(playerList, new PlayerInitiativeComperator());
        Collections.sort(monsterController.getMonsterList(), new MonsterInitiativeComperator());

        System.out.println("\nSorted");

        for(int i = 0; i < playerList.size();i++) {
            System.out.println(playerList.get(i));
        }
        System.out.println(" ");
        for(int i = 0; i < monsterController.getMonsterList().size();i++) {
            System.out.println(monsterController.getMonsterList().get(i));
        }
        /*
        new dicitonary combatlist<string, int>

        foreach monster in monsterlist{
            combatlist.add("monster", monster.initiative)

            combatList tabell
            playerlist tabell
            join playerlist on combatlist on playerid = playerid

            playerlist.get(i).setDamage -> playerList faktiskt dmg
        }

        foreach player in playerlist{
            combatlist.add("player", player.initiative)
            "Player1", List<Player>

            "Monster3" 80
            "player1" 20

            Collections.Sort(combatList, new combatInitivatieComperator)

            while(!combatlist.isEmpty)

            if ( && !combatlist.isDead
            combat ->
            "player1" 20
            "monster3" 80

            fight == över

            combatlist.remove(monster) == isDead
            playlist = combatlist -> player 2 isDead
            palylist == if (isdead)
            writeline (player.get(isDead)


        }

        init = 1, går först
        1 monster 2
        2 monster 3
        3 monster 1

        monsterFightIndex == attack mot monster på plats 1

        monster 1 - 80
        monster 2 - 20
        player 1 - 40
        player 2- 60

        sorterar:

       1. monster 2 - 20 MonsterList
       2. player 1 - 40 PlayerList
       3. player 2- 60 PlayerList
       4. monster 1 - 80 MonsterList

        sortera eller iterera över combatList

        playerListan har värden -> om de förändras i fight, stannar som de blev satta.
        player 1 tar 20 dmg -> play1 50 hp, play1 30hp

        combatList -> spelaren i combatListan player1 tar -20 hp
        playerListan -> spelaren 1  inte tar -20hp

        när combaten är över, värderna kan vara kvar och sen skrivas över till playerListan?


        combatList = monsterlist, playerlist

        Gå igenom monsterListan -> gå igenom initiative

        String, List



        Dictionary<String, List<T>> dict= new Hashtable<>();
        for (player: playerList) {
            combatlist.add("Player", playerList)
        }
         for (monster : monsterlist) {
            combatlist.add("Monster", monsterList)
        }



        combatlist.listOf<T>



        //fight startar
        //sorterar initiative
        // fighten går i turordning baserat på lägst initiative

        player hasPlayed

        playerResetHP() <- om spelaren ska få tillbaka sitt HP efter fighten

        //lambda
        while(monsterlist != dead || playerlist != dead)

            Collections.sort(playerList, new PlayerInitiativeComperator());
            Collections.sort(monsterList, new MonsterInitiativeComperator());


             //sort before start playing

            player init 1 -> går först
                                        monster init 1 ->
            player init 2 -> går andra

            find a way to filter out player that hasPlayed = true
            

            if (player.init > monster.init) {
                switch menu for all attacks and spells
                player attack -> monster, spells allt tjena
                checkMonsterDead()
                setPlayerCurrencyIfMonsterDead
                ...
                player.get(i).hasPlayed = true;
            }
            else
                monster, monster figting logic ->
                          monster 20% chans att stunna dig
                          checkPlayerIfDead()


            countRounds++;

            //insert fight here as well, so we can use both attack and spells...

            //my lists are sorted...
            //compare initiative and use that
            //add it into two lists? i'd rather not...

        } */

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

