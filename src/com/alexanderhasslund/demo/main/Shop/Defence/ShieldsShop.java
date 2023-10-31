package com.alexanderhasslund.demo.main.Shop.Defence;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import java.util.List;

public class ShieldsShop {

    private List<Player> playerList;

    public ShieldsShop(List<Player> playerList) {
        this.playerList = playerList;
    }


    public void shieldsShopSwitch (int playerIndex) {
        Shields shields = new Shields();
        PlayerChoice playerChoice = new PlayerChoice();
        int shieldPrice = 0;

        System.out.println(playerChoice.shieldsMenu());
        int swordChoice = Input.intInput();
        switch (swordChoice) {
            case 1 -> {
                playerList.get(playerIndex).getInventoryList().add(shields.standardShield());
                shieldPrice = 200;
            }
            case 2 -> {
                playerList.get(playerIndex).getInventoryList().add(shields.bulkShield());
                shieldPrice = 500;
            }
            case 3 -> {
                playerList.get(playerIndex).getInventoryList().add(shields.spikedShield());
                shieldPrice = 1000;
            }
            case 4 -> {
                playerList.get(playerIndex).getInventoryList().add(shields.divineShield());
                shieldPrice = 15000;
            }
        }
        playerList.get(playerIndex).setCurrency(playerList.get(playerIndex).getCurrency() - shieldPrice);
        checkShieldSlot(shieldPrice);
        //return shieldPrice;

    }


    public void checkShieldSlot(int shieldPrice) {

        playerList.forEach(player -> {

            System.out.println(player.getName() + "'s Inventory:");
            player.getInventoryList().forEach(item -> {
                System.out.println("bought " + item.getItemName() + " with " + item.getDamage() +" damage");
                System.out.println("and a cost of: " + shieldPrice);
                System.out.println("and now has balance left: " + (player.getCurrency() - shieldPrice));
            });
        });
    }
}

