package com.alexanderhasslund.demo.main.Engine;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.File.StringLore;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import com.alexanderhasslund.demo.main.Shop.ShopMenu;

public class GameStartControl {


    public void startIntroductionGame() throws InterruptedException {
        StringManipulator stringManipulator = new StringManipulator();

        RegisterPlayer registerPlayer = new RegisterPlayer();
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
    }

    public void startIntroductionChoice() throws InterruptedException {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        PlayerChoice playerChoice = new PlayerChoice();
        StringManipulator stringManipulator = new StringManipulator();
        stringManipulator.manipulateString(playerChoice.newGameSetup());
        registerPlayer.playerCount();
        registerPlayer.chooseClass();
        registerPlayer.choosePlayerName();
        registerPlayer.getPlayerInformation();

    }
}