package com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Levels.Maps.TheHallsOfKaraz;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

import java.util.List;

public class GameLevelOne {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public GameLevelOne(int calculateLevels, List<Player> playerList, int countPlayers) {
        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public void gameSwitchOne() {
        TheHallsOfKaraz theHallsOfKaraz = new TheHallsOfKaraz(calculateLevels, playerList, countPlayers);
        PlayerChoice playerChoice = new PlayerChoice();

        boolean isChoice = true;
        do {
            System.out.println(playerChoice.presentLevel1());
            int gameMapChoice = Input.intInput();

            switch (gameMapChoice) {
                case 1 -> {
                    theHallsOfKaraz.startUpGameOne();
                }
                case 2 -> {
                    System.out.println(" Level not reached");
                }
                case 3 -> {
                    System.out.println(" Level not reached");
                }
                case 4 -> {
                    System.out.println(" Level not reached");
                }
                case 5 -> {
                    System.out.println(" quit");
                    isChoice = false;
                }
                default -> {
                    System.out.println("Use right input...");
                }
            }
        } while (isChoice);
    }
}
