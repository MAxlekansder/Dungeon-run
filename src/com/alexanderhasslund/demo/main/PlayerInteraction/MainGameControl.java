package com.alexanderhasslund.demo.main.PlayerInteraction;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.File.SaveFile;
import com.alexanderhasslund.demo.main.Monster.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Shop.ShopMenu;

import java.io.IOException;
import java.util.List;

public class MainGameControl {

    private List<Player> playerList;

    public MainGameControl(List<Player> playerList) {
        this.playerList = playerList;
    }


    public void mainSwitch() throws IOException {
        PlayerChoice playerChoice = new PlayerChoice();
        ShopMenu shopMenu = new ShopMenu(playerList); // this line becomes null, seems like something is wrong
        SaveFile saveFile = new SaveFile(playerList);
        MonsterController monsterController = new MonsterController();
        boolean isMainPlaying = true;


        do {
            System.out.println(playerChoice.mainMenuChoice());
            switch (Input.intInput()) {
                case 1 -> {
                    // continue
                    monsterController.valueController();
                }
                case 2 -> {
                    // shop
                    shopMenu.mainShopMenu();

                }
                case 3 -> {
                     saveFile.saveFilePlayer();
                }
                case 4 -> {
                    // current status
                }
                case 5 -> {
                    // current level
                }
                case 6 -> {
                    // quit game
                    isMainPlaying = false;
                }
                default -> {
                    System.out.println("error");
                }
            }
        } while (isMainPlaying);

    }
}
