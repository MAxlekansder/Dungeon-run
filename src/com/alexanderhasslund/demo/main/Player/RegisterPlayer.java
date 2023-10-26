package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.Input;

import java.util.ArrayList;
import java.util.List;

public class RegisterPlayer {
    List<Player> playerList = new ArrayList<>();
    private int countPlayers;

    //find a formula for exp? <- no need now

    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }

    public void playerCount(Player player) {
        System.out.println("Hur många ska spela spelet?");
        setCountPlayers(Input.intInput());
    }

    public void setPlayerName(Player player) {
        System.out.println("Din karaktär behöver ett namn... vad väljer du?");

    }


    public void chooseClass(Input input, Player player) {
        boolean choice = true;
        for (int i = 0; i < getCountPlayers(); i++) {
            do {
                switch (Input.intInput()) {
                    case 1 -> { playerList.add(new Barbarian());choice = false; }
                    case 2 -> { playerList.add(new Rogue());choice = false; }
                    case 3 -> { playerList.add(new Sorcerer());choice = false; }
                    default -> {System.out.println("Use right input");}
                }

                System.out.printf("Enter character name, for player %s", (i + 1));
                player.setName(Input.stringInput());

                playerList.get(i).setName(player.getName());
                playerList.get(i).setPlayerId(i + 1);
            } while (choice);
        }
    }

    
}

