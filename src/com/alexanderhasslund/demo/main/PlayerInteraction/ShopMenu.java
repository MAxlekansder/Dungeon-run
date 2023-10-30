package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

import java.util.List;

public class ShopMenu {

    private List<Player> playerList;

    public ShopMenu(List<Player> playerList) {
        this.playerList = playerList;
    }
    public void basicShopMenu() {
        System.out.println("Welcome to the main shop!: ");
        System.out.println("1.Swords  2.Shields  3.Potions");
        RegisterPlayer registerPlayer = new RegisterPlayer();

        SwordsMenu swordsMenu = new SwordsMenu(playerList);

        ShieldsMenu shieldsMenu = new ShieldsMenu();
        PotionsMenu potionsMenu = new PotionsMenu();

        //Player player = new Player();
        boolean isBuying = true;
        do {
            switch (Input.intInput()) {
                case 1 -> {
                    //swords:
                    swordsMenu.swordsShopSwitch();
                    //registerPlayer.getPlayerList().stream().map(Player::getClassName).map(Barbarian::)
                    //registerPlayer.getPlayerList().forEach(player -> {});
                    // registerPlayer.getPlayerList();
                    // registerPlayer.getPlayerList().;
                    isBuying = false;
                }
                case 2 -> {
                    shieldsMenu.ShieldShopSwitch();
                    //Shields
                    //player.getInventoryList();
                    //player.setInventoryList();


                }
                case 3 -> {
                    potionsMenu.potionsMenuSwitch();
                    // potions
                }
            }
        } while (isBuying);
    }
}
