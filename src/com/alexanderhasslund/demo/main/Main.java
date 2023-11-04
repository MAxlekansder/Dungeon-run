package com.alexanderhasslund.demo.main;
import com.alexanderhasslund.demo.main.PlayerInteraction.GameStartControl;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, NoSuchFieldException, IllegalAccessException {
        GameStartControl gameStartControl = new GameStartControl();

        gameStartControl.startIntroductionGame();


    }
}


