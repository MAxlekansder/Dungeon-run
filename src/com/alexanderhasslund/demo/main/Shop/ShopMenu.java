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
        SwordsShop swordsShop = new SwordsShop(playerList);
        ShieldsShop shieldsShop = new ShieldsShop(playerList);
        PotionsShop potionsShop = new PotionsShop(playerList);

        choosePlayerShop();

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

    public int choosePlayerShop() {
        System.out.println("What player is using the shop?");
        int playerChoice = 0;
        for (int i = 0; i < playerList.size();i++) {
            System.out.println(
                    playerList.get(i).getId() + 1 + " "
                    + playerList.get(i).getName() + " "
                    + playerList.get(i).getDamage() + " "
                    + playerList.get(i).getCurrency());
        }
        return playerChoice = Input.intInput() - 1;


    }
}
