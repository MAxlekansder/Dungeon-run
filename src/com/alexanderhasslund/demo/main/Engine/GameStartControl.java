package com.alexanderhasslund.demo.main.Engine;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.File.StringLore;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class GameStartControl {


    public void startIntroductionGame() throws InterruptedException {
        StringManipulator stringManipulator = new StringManipulator();
        RegisterPlayer registerPlayer = new RegisterPlayer();
        StringLore stringLore = new StringLore();

        //stringManipulator.manipulateString(stringLore.intro());
        stringLore.gameTitle();
        System.out.println(stringLore.gameIntroductionClasses());
       // stringManipulator.manipulateString(stringLore.gameIntroductionRules());

        Barbarian barbarian = new Barbarian();
        System.out.println(barbarian);
        Rogue rogue = new Rogue();
        System.out.println(rogue);
        Sorcerer sorcerer = new Sorcerer();
        System.out.println(sorcerer);

        registerPlayer.playerCount();
        registerPlayer.chooseClass();
        registerPlayer.getPlayerInformation();

    }

}
/*
 private StringManipulator _stringManipulator;

    public GameStartControl(StringManipulator stringManipulator) {
        _stringManipulator = stringManipulator;
    }

    public void startIntroductionGame() throws InterruptedException {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        StringLore stringLore = new StringLore();

        _stringManipulator.manipulateString(stringLore.intro());
        stringLore.gameTitle();
        System.out.println(stringLore.gameIntroductionClasses());
        _stringManipulator.manipulateString(stringLore.gameIntroductionRules());

        Barbarian barbarian = new Barbarian();
        System.out.println(barbarian);
        Rogue rogue = new Rogue();
        System.out.println(rogue);
        Sorcerer sorcerer = new Sorcerer();
        System.out.println(sorcerer);

        registerPlayer.playerCount();
        registerPlayer.chooseClass();
        registerPlayer.getPlayerInformation();

    }
 */