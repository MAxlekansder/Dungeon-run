package com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Levels.Maps.CityMarkazh;
import com.alexanderhasslund.demo.main.Levels.Maps.FinalRoomOfKazarak;
import com.alexanderhasslund.demo.main.Levels.Maps.TheHallsOfKaraz;
import com.alexanderhasslund.demo.main.Levels.Maps.UpperPlateau;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

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
        FinalRoomOfKazarak finalRoomOfKazarak = new FinalRoomOfKazarak();
        CityMarkazh cityMarkazh = new CityMarkazh();
        UpperPlateau upperPlateau = new UpperPlateau();
        TheHallsOfKaraz theHallsOfKaraz = new TheHallsOfKaraz(calculateLevels, playerList, countPlayers);
        PlayerChoice playerChoice = new PlayerChoice();

        System.out.println(playerChoice.presentLevel4());
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

