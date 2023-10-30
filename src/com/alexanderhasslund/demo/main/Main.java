package com.alexanderhasslund.demo.main;
import com.alexanderhasslund.demo.main.Engine.GameStartControl;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.StartMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        StartMenu startMenu = new StartMenu();
        GameStartControl gameStartControl = new GameStartControl();

        gameStartControl.startIntroductionGame();
        startMenu.mainGameSwitch();

    }
}


