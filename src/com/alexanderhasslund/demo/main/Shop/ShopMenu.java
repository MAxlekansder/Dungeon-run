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
        //choosePlayerShop();
        int playerIndex = choosePlayerShop();

        boolean isBuying = true;
        do {
            System.out.println(playerChoice.insideShop());
            switch (Input.intInput()) {
                case 1 -> {
                    swordsShop.swordsShopSwitch(playerIndex);
                    //swords
                }
                case 2 -> {
                    shieldsShop.shieldsShopSwitch(playerIndex);
                    //Shields
                }
                case 3 -> {
                    potionsShop.potionsMenuSwitch(playerIndex);
                    // potions
                }
                case 4 -> {
                    isBuying = false;
                }
            }
        } while (isBuying);
    }

    // build a safety check here to make sure wrong name isnt put in ->
    public int choosePlayerShop() {
        System.out.println("What player is using the shop?");
        playerList.forEach(player -> System.out.println("PLAYERLIST: " + player.getName().toUpperCase() +" "+ player.getClassName() + " " + player.getLevel()));


        String playerChoice1 = Input.stringInput().toLowerCase();
        int playerChoice = 0;

        for (int i = 0; i < playerList.size();i++) {
            System.out.println(
                    " Name: " + playerList.get(i).getName() +
                    " Current currency: "+ playerList.get(i).getCurrency());

            if (playerList.get(i).getName().toLowerCase().equals(playerChoice1)){
                playerChoice = i;
            } else {
                System.out.println("Wrong input, try again...");
            }
        }
        return playerChoice;
    }
}
