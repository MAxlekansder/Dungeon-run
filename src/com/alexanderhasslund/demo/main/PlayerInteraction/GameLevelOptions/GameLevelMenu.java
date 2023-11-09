package com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class GameLevelMenu {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public GameLevelMenu(int calculateLevels, List<Player> playerList, int countPlayers) {
        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public void gameViewSwitch(){
        GameLevelOne gameLevelOne = new GameLevelOne(calculateLevels, playerList, countPlayers);
        GameLevelTwo gameLevelTwo = new GameLevelTwo(calculateLevels, playerList, countPlayers);
        GameLevelThree gameLevelThree = new GameLevelThree(calculateLevels, playerList, countPlayers);
        GameLevelFour gameLevelFour = new GameLevelFour(calculateLevels, playerList, countPlayers);
        boolean isGameLevel = true;

        while (isGameLevel) {
            switch (calculateLevels) {
                case 1 -> {gameLevelOne.gameSwitchOne(); isGameLevel = false;}
                case 2 -> {gameLevelTwo.gameSwitchTwo(); isGameLevel = false;}
                case 3 -> {gameLevelThree.gameSwitchThree(); isGameLevel = false;}
                case 4 -> {gameLevelFour.gameSwitchFour(); isGameLevel = false;}
                case 5 -> {isGameLevel = false;}
                default -> {System.out.println("Use the right input");}
            }
        }
    }

}
