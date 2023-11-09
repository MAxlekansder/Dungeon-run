package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Combat.FirstCombatEncounter;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterController;
import com.alexanderhasslund.demo.main.Player.PlayerController;

import java.io.IOException;

public class GameStartControl {


    public void startIntroductionGame() throws InterruptedException, IOException, NoSuchFieldException, IllegalAccessException {
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

        System.out.println(stringLore.ultimateClassPresentation());
        //stringManipulator.manipulateString(stringLore.gameIntroductionRules());
        System.out.println("Press enter to continue, where you start the game and choose class");

        String enter = Input.stringInput();
        startUpMenu();

    }


    public void startUpMenu() throws InterruptedException, IOException, NoSuchFieldException, IllegalAccessException {
        PlayerChoice playerChoice = new PlayerChoice();
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

    //Singleton-isch...
    public void startIntroductionChoice() throws IOException, NoSuchFieldException, IllegalAccessException {
        PlayerController playerController = new PlayerController();

        PlayerChoice playerChoice = new PlayerChoice();
        StringManipulator stringManipulator = new StringManipulator();
        //  stringManipulator.manipulateString(playerChoice.newGameSetup());
        playerController.playerCount();
        FirstCombatEncounter firstCombatEncounter = new FirstCombatEncounter(playerController.getPlayerList(), playerController.getCountPlayers());
        playerController.chooseClass();
        playerController.choosePlayerName();
        playerController.getPlayerInformation();
        MainGameControl mainGameControl = new MainGameControl(playerController.getPlayerList(), playerController.getCountPlayers());


        //stringManipulator.manipulateStringFast(playerChoice.firstFightIntroduction());
        firstCombatEncounter.firstPlayerFight();
        mainGameControl.mainSwitch();
    }
}
