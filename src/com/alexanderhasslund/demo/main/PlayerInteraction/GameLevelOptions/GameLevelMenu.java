package com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class GameLevelMenu {


    public void gameViewSwitch(int calculateLevels){
        GameLevelOne gameLevelOne = new GameLevelOne();
        GameLevelTwo gameLevelTwo = new GameLevelTwo();
        GameLevelThree gameLevelThree = new GameLevelThree();
        GameLevelFour gameLevelFour = new GameLevelFour();
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
