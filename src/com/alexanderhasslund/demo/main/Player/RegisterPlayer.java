package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.GameStartControl;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.ArrayList;
import java.util.List;

public class RegisterPlayer {
    List<Player> playerList = new ArrayList<>();
    private Player player;
    private int countPlayers;


    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }


    public void playerCount() {
        System.out.print("Please enter number of players: ");
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

                System.out.printf("Enter character name, for player %s: ", (i + 1));
                playerList.get(i).setName(Input.stringInput());
                playerList.get(i).setPlayerId(i + 1);
            } while (choice);
        }

        for (int i = 0; i < countPlayers; i++) {
            System.out.println(playerList.get(i));
        }
    }

    
}

