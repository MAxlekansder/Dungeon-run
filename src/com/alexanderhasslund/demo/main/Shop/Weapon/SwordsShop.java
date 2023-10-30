package com.alexanderhasslund.demo.main.Shop.Weapon;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Shop.Weapon.Swords;

import java.util.List;

public class SwordsShop {

    private List<Player> playerList;

    public SwordsShop(List<Player> playerList) {
        this.playerList = playerList;
    }

    // introduce logic so each player can buy
    public void swordsShopSwitch () {
        Swords swords = new Swords();

        System.out.println("sword shop");
        int swordChoice = Input.intInput();
        switch (swordChoice) {
            case 1 -> {
                //swords.standardSword();
                playerList.forEach(player -> {
                            player.getInventoryList().add(0,( swords.standardSword()));
                        }
                );
            }
            case 2 -> {
                //swords.fastSword();
                playerList.forEach(player -> {
                            player.getInventoryList().add(0, swords.fastSword());
                        }
                );
            }
            case 3 -> {
               // swords.sharpSword();
                playerList.forEach(player -> {
                            player.getInventoryList().add(0, swords.sharpSword());
                        }
                );
            }
            case 4 -> {
                playerList.forEach(player -> {
                            player.getInventoryList().add(0, swords.divineSword());
                        }
                );
            }
        }
        checkSwordSlot();
    }

    public void checkSwordSlot() {

            playerList.forEach(player -> {
            System.out.println(player.getName() + "'s Inventory:");
            player.getInventoryList().forEach(item -> {
                System.out.println("  " + item.getItemName() + " " + item.getDamage());
            });
        });
    }
}
