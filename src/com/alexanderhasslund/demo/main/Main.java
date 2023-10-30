package com.alexanderhasslund.demo.main;
import com.alexanderhasslund.demo.main.Engine.GameStartControl;
import com.alexanderhasslund.demo.main.PlayerInteraction.StartMenu;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StartMenu startMenu = new StartMenu();
        GameStartControl gameStartControl = new GameStartControl();

        gameStartControl.startIntroductionGame();
        startMenu.mainGameSwitch();

    }
}


