package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.File.SaveFile;
import com.alexanderhasslund.demo.main.Player.Player;

import java.io.IOException;
import java.util.List;

public class MainGameMenu {

    private List<Player> playerList;

    public MainGameMenu(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void mainSwitch() throws IOException {
        System.out.println("in main switch");
       // SaveFile saveFile = new SaveFile(playerList);
        switch (3) {
            case 1 -> {}
            case 2 -> {
            }
            case 3 -> {
               // saveFile.saveFilePlayer();
            }
            default -> {
                System.out.println("error");
            }
        }

    }
}
