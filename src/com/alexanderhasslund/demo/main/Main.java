package com.alexanderhasslund.demo.main;
import com.alexanderhasslund.demo.main.Engine.GameStartControl;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameStartControl gameStartControl = new GameStartControl();

        gameStartControl.startIntroductionGame();

    }
}


