package com.alexanderhasslund.demo.main.Shop;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import com.alexanderhasslund.demo.main.Shop.Defence.ShieldsShop;
import com.alexanderhasslund.demo.main.Shop.Potions.PotionsShop;
import com.alexanderhasslund.demo.main.Shop.Weapon.SwordsShop;

import java.util.List;

public class ShopMenu {

    private List<Player> playerList;

    public ShopMenu(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void mainShopMenu() {
        SwordsShop swordsShop = new SwordsShop(playerList);
        ShieldsShop shieldsShop = new ShieldsShop(playerList);
        PotionsShop potionsShop = new PotionsShop(playerList);
        PlayerChoice playerChoice = new PlayerChoice();

        System.out.println(playerChoice.mainShop());
        choosePlayerShop();

        boolean isBuying = true;
        do {
            switch (Input.intInput()) {
                case 1 -> {
                    swordsShop.swordsShopSwitch(choosePlayerShop());
                    //swords
                }
                case 2 -> {
                    shieldsShop.shieldsShopSwitch(choosePlayerShop());
                    //Shields
                }
                case 3 -> {
                    potionsShop.potionsMenuSwitch(choosePlayerShop());
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
        String playerChoice1 = Input.stringInput().toLowerCase();
        for (int i = 0; i < playerList.size();i++) {
            System.out.println(
                    " Name:  " + playerList.get(i).getName() +
                    " Current currency: "+ playerList.get(i).getCurrency());

            if (playerList.get(i).getName().toLowerCase().equals(playerChoice1)){
                playerChoice = playerList.get(i).getPlayerId();
            }
        }
        return playerChoice;
    }
}
