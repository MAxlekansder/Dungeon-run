package com.alexanderhasslund.demo.main.Shop.Weapon;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import java.util.List;

public class SwordsShop {

    private List<Player> playerList;

    public SwordsShop(List<Player> playerList) {
        this.playerList = playerList;
    }


    public int swordsShopSwitch (int playerIndex) {
        Swords swords = new Swords();
        PlayerChoice playerChoice = new PlayerChoice();
        int swordPrice = 0;

        System.out.println(playerChoice.swordsMenu());
        int swordChoice = Input.intInput();
        switch (swordChoice) {
            case 1 -> {
                playerList.get(playerIndex).getInventoryList().add(swords.standardSword());
                swordPrice = 200;
            }
            case 2 -> {
                playerList.get(playerIndex).getInventoryList().add(swords.fastSword());
                swordPrice = 500;
            }
            case 3 -> {
                playerList.get(playerIndex).getInventoryList().add(swords.sharpSword());
                swordPrice = 1000;
            }
            case 4 -> {
                playerList.get(playerIndex).getInventoryList().add(swords.divineSword());
                swordPrice = 15000;
            }
        }
        checkSwordSlot(swordPrice);
        return swordPrice;

    }


    public void checkSwordSlot(int swordPrice) {

            playerList.forEach(player -> {

                System.out.println(player.getName() + "'s Inventory:");
                player.getInventoryList().forEach(item -> {
                    System.out.println("bought " + item.getItemName() + " with " + item.getDamage() +" damage");
                    System.out.println("and a cost of: " + swordPrice);
                    System.out.println("and now has balance left: " + (player.getCurrency() - swordPrice));
                });
        });
    }
}
