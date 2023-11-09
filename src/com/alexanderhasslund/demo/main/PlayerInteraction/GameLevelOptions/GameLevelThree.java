package com.alexanderhasslund.demo.main.PlayerInteraction.GameLevelOptions;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Levels.Maps.CityMarkazh;
import com.alexanderhasslund.demo.main.Levels.Maps.TheHallsOfKaraz;
import com.alexanderhasslund.demo.main.Levels.Maps.UpperPlateau;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;

public class GameLevelThree {

    public void gameSwitchThree() {
        CityMarkazh cityMarkazh = new CityMarkazh();
        UpperPlateau upperPlateau = new UpperPlateau();
        TheHallsOfKaraz theHallsOfKaraz = new TheHallsOfKaraz();
        PlayerChoice playerChoice = new PlayerChoice();

        boolean isChoice = true;
        do {
            System.out.println(playerChoice.presentLevel3());
            int gameMapChoice = Input.intInput();

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
        }while (isChoice);
    }
}
