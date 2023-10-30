package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import com.alexanderhasslund.demo.main.PlayerInteraction.SwordsMenu;
import com.alexanderhasslund.demo.main.Shop.Weapon.Swords;

import java.util.ArrayList;
import java.util.List;


public class RegisterPlayer {
    private List<Player> playerList = new ArrayList<>();
    private int countPlayers;

    public RegisterPlayer() {
        this.playerList = new ArrayList<>();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }

    public void playerCount() {
        System.out.print("\nPlease enter number of players: ");
        setCountPlayers(Input.intInput());

    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void chooseClass() {
        for (int i = 0; i < getCountPlayers(); i++) {

            PlayerChoice playerChoice = new PlayerChoice();
            System.out.println(playerChoice.nameAndClass());
            boolean choice = true;
            do {
                switch (Input.intInput()) {
                    case 1 -> {playerList.add(i, new Barbarian());choice = false;}
                    case 2 -> {playerList.add(i, new Rogue());choice = false;}
                    case 3 -> {playerList.add(i, new Sorcerer());choice = false;}
                    default -> {System.out.println("Use right input");}

                }
            } while (choice);
            SwordsMenu swordsMenu = new SwordsMenu(getPlayerList());
        }
    }

    public void choosePlayerName() {
        for ( int i = 0; i < getCountPlayers(); i++) {
            System.out.printf("Enter character name, for player %s: ", (i + 1));
            playerList.get(i).setName(Input.stringInput());
            playerList.get(i).setPlayerId(i + 1);

        }
    }


    public List<Player> getPlayerInformation() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(
                    " Name = " + playerList.get(i).getName() + "  || "
                  + " Class name = " + playerList.get(i).getClassName() + "  || "
                  + " Currency = " + playerList.get(i).getCurrency() + "  || "
                  + " Experience = " + playerList.get(i).getExperience() + "  || "
            );

            System.out.println(playerList.get(i));
            System.out.printf("Inventory slot %s: " + playerList.get(i).getInventoryList(), i, "\n");

        }
        return playerList;
    }

    public void addItem() {
        Inventory sword = new Inventory("Sword");
        Inventory shield = new Inventory("Shield");
        Inventory potion = new Inventory("Health Potion");
        Swords swords = new Swords();



        for (int i = 0; i < playerList.size(); i++) {
            //playerList.get(i).getInventoryList().add(sword);
            //playerList.get(i).getInventoryList().add(swords.fastSword());
            System.out.println(playerList.get(i).getInventoryList());
        }
    }
}


