package com.alexanderhasslund.demo.main.Maps.GameLevelOptions;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.Maps.GameLevelFloors.CityMarkazh;
import com.alexanderhasslund.demo.main.Maps.GameLevelFloors.FinalRoomOfKazarak;
import com.alexanderhasslund.demo.main.Maps.GameLevelFloors.TheHallsOfKaraz;
import com.alexanderhasslund.demo.main.Maps.GameLevelFloors.UpperPlateau;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import com.alexanderhasslund.demo.main.PlayerInteraction.StringLore;

import java.util.List;

public class GameLevelFour {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public GameLevelFour(int calculateLevels, List<Player> playerList, int countPlayers) {
        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public void gameSwitchFour() {
        FinalRoomOfKazarak finalRoomOfKazarak = new FinalRoomOfKazarak(calculateLevels, playerList, countPlayers);
        CityMarkazh cityMarkazh = new CityMarkazh(calculateLevels, playerList, countPlayers);
        UpperPlateau upperPlateau = new UpperPlateau(calculateLevels, playerList, countPlayers);
        TheHallsOfKaraz theHallsOfKaraz = new TheHallsOfKaraz(calculateLevels, playerList, countPlayers);
        PlayerChoice playerChoice = new PlayerChoice();
        StringManipulator stringManipulator = new StringManipulator();



        System.out.println(playerChoice.presentFinalLevel());
        int gameMapChoice = Input.intInput();
        boolean isChoice = true;
        do {
            switch (gameMapChoice) {
                case 1 -> {
                    theHallsOfKaraz.startUpGameOne();
                    isChoice = false;
                }
                case 2 -> {
                    upperPlateau.startUpGameTwo();
                    isChoice = false;
                }
                case 3 -> {
                    cityMarkazh.startUpGameThree();
                    isChoice = false;
                }
                case 4 -> {
                    finalRoomOfKazarak.startUpGameFour();
                    isChoice = false;
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

