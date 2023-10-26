package com.alexanderhasslund.demo.main;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        RegisterPlayer registerPlayer = new RegisterPlayer();
        System.out.println("Hur många spelare?");
        int countPlayers = Input.intInput();

        for (int i = 0; i < countPlayers; i++) {
            playerList.add(new Barbarian());
            System.out.println(playerList.get(i).getClass());
        }
    }
}
