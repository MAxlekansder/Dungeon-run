package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.ArrayList;
import java.util.List;


public class RegisterPlayer {
    private List<Player> playerList = new ArrayList<>();
    private int countPlayers;


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
                  + " Currency = " + playerList.get(i).getCurrency() + "  || "
                  + " Experience = " + playerList.get(i).getExperience() + "  || "
            );
        }
        return playerList;
    }

}

