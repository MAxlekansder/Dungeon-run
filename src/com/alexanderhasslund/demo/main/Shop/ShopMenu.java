package com.alexanderhasslund.demo.main.Shop;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.Shop.Defence.ShieldsShop;
import com.alexanderhasslund.demo.main.Shop.Potions.PotionsShop;
import com.alexanderhasslund.demo.main.Shop.Weapon.SwordsShop;

import java.util.List;

public class ShopMenu {

    private List<Player> playerList;

    public ShopMenu(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void basicShopMenu() {
        System.out.println("Welcome to the main shop!: ");
        System.out.println("1.Swords  2.Shields  3.Potions");

        SwordsShop swordsShop = new SwordsShop(playerList);
        ShieldsShop shieldsShop = new ShieldsShop(playerList);
        PotionsShop potionsShop = new PotionsShop(playerList);


        boolean isBuying = true;
        do {
            switch (Input.intInput()) {
                case 1 -> {
                    swordsShop.swordsShopSwitch();
                    //swords
                }
                case 2 -> {
                    shieldsShop.shieldsShopSwitch();
                    //Shields
                }
                case 3 -> {
                    potionsShop.potionsMenuSwitch();
                    // potions
                }
                case 4 -> {
                    isBuying = false;
                }
            }
        } while (isBuying);
    }
}
