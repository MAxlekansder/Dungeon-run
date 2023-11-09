package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions.GameLevelFour;
import com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions.GameLevelOne;
import com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions.GameLevelThree;
import com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions.GameLevelTwo;

import java.util.List;

public class GameLevelMenu {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public GameLevelMenu(int calculateLevels, List<Player> playerList, int countPlayers) {
        this.playerList = playerList;
        this.countPlayers = countPlayers;
        this.calculateLevels = calculateLevels;
    }

    public void gameViewSwitch(){
        GameLevelOne gameLevelOne = new GameLevelOne(calculateLevels, playerList, countPlayers);
        GameLevelTwo gameLevelTwo = new GameLevelTwo(calculateLevels, playerList, countPlayers);
        GameLevelThree gameLevelThree = new GameLevelThree(calculateLevels, playerList, countPlayers);
        GameLevelFour gameLevelFour = new GameLevelFour(calculateLevels, playerList, countPlayers);
        boolean isGameLevel = true;

        while (isGameLevel) {
            switch (calculateLevels) {
                case 1 -> {gameLevelOne.gameSwitchOne(); calculateLevels++; isGameLevel = false;}
                case 2 -> {gameLevelTwo.gameSwitchTwo(); calculateLevels++;  isGameLevel = false;}
                case 3 -> {gameLevelThree.gameSwitchThree(); calculateLevels++; isGameLevel = false;}
                case 4 -> {gameLevelFour.gameSwitchFour(); calculateLevels++; isGameLevel = false;}
                case 5 -> {isGameLevel = false;}
                default -> {System.out.println("Use the right input");}
            }
        }
    }

}
