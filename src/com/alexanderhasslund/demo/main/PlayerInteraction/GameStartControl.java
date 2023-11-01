package com.alexanderhasslund.demo.main.PlayerInteraction;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

import java.io.IOException;

public class GameStartControl {


    public void startIntroductionGame() throws InterruptedException, IOException {
        StringManipulator stringManipulator = new StringManipulator();
        StringLore stringLore = new StringLore();

        //stringManipulator.manipulateString(stringLore.intro());
        stringLore.gameTitle();
        System.out.println(stringLore.gameIntroductionClasses());

        Barbarian barbarian = new Barbarian();
        System.out.println(barbarian);
        Rogue rogue = new Rogue();
        System.out.println(rogue);
        Sorcerer sorcerer = new Sorcerer();
        System.out.println(sorcerer);

        //stringManipulator.manipulateString(stringLore.gameIntroductionRules());

        startUpMenu();

    }



    public void startUpMenu() throws InterruptedException, IOException {
        PlayerChoice playerChoice = new PlayerChoice();
        RegisterPlayer registerPlayer = new RegisterPlayer();
        boolean isPlaying = true;


        // introduce same logic here as in playerChoice with blacking out continue save...
        do {
            playerChoice.startMenuChoice();
            switch (Input.intInput()) {
                case 1 -> {
                    // start new game
                    // while in this menu -> only loop that switch
                    // create a check to see if playerList exists?
                    startIntroductionChoice();

                }
                case 2 -> {
                    System.out.println("No file found");
                    // continue
                    // load into the save
                    // if no save file exists, make the text grey...
                }
                case 3 -> {
                    // highscore
                }
                case 4 -> {
                    isPlaying = false;
                }
            }
        } while (isPlaying);
    }

    public void startIntroductionChoice() throws InterruptedException, IOException {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        PlayerChoice playerChoice = new PlayerChoice();
        StringManipulator stringManipulator = new StringManipulator();
        //  stringManipulator.manipulateString(playerChoice.newGameSetup());
        registerPlayer.playerCount();
        registerPlayer.chooseClass();
        registerPlayer.choosePlayerName();
        registerPlayer.getPlayerInformation();
        MainGameControl mainGameControl = new MainGameControl(registerPlayer.getPlayerList());
        mainGameControl.mainSwitch();
    }
}
