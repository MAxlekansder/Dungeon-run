package com.alexanderhasslund.demo.main;

import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.File.StringLore;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        StringManipulator stringManipulator = new StringManipulator();
        StringLore stringLore = new StringLore();

        //System.out.println(stringManipulator.manipulateString(stringLore.intro()));
        stringLore.gameTitle();

        /*
        System.out.println("Hur många ska spela spelet?");
        registerPlayer.setCountPlayers(Input.intInput());

        System.out.println("välj klass");
        registerPlayer.chooseClass(Input.intInput());

         */
    }
}
