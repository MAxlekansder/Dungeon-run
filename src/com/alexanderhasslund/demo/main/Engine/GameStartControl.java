package com.alexanderhasslund.demo.main.Engine;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.File.StringLore;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.PlayerInteraction.ShopMenu;
import com.alexanderhasslund.demo.main.PlayerInteraction.SwordsMenu;

import java.util.List;

public class GameStartControl {

    private List<Player> playerList;

    public GameStartControl() {

    }

    public GameStartControl(List<Player> playerList) {
        this.playerList = playerList;
    }

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
        registerPlayer.choosePlayerName();
        registerPlayer.getPlayerInformation();
        registerPlayer.addItem();
        ShopMenu shopMenu = new ShopMenu(playerList);

        shopMenu.basicShopMenu();
        //swordsMenu.swordsShopSwitch();


    }
}