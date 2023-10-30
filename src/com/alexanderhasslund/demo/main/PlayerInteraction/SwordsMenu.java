package com.alexanderhasslund.demo.main.PlayerInteraction;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;
import com.alexanderhasslund.demo.main.Shop.Weapon.Swords;

import java.util.List;

public class SwordsMenu {

    private List<Player> playerList;

    public SwordsMenu(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void swordsShopSwitch () {
        Swords swords = new Swords();

        System.out.println("sword shop");
        int swordChoice = Input.intInput();
        switch (swordChoice) {
            case 1 -> {
                //swords.standardSword();
                playerList.forEach(player -> {
                            player.getInventoryList().add(swords.standardSword());
                        }
                );
            }
            case 2 -> {
                swords.fastSword();
                for (int i = 0; i < playerList.size(); i++) {
                    playerList.get(i).getInventoryList().add(swords.fastSword());
                }
            }
            case 3 -> {
                swords.sharpSword();
                playerList.forEach(player -> {
                            player.getInventoryList().add(swords.sharpSword());
                        }
                );
            }
            case 4 -> {
                swords.divineSword();
               /* registerPlayer.getPlayerList().forEach(player -> {
                            player.getInventoryList().add(swords.divineSword());
                        }
                ); */
            }
        }
        checkSwordSlot();
    }

    public void checkSwordSlot() {

        RegisterPlayer registerPlayer = new RegisterPlayer();
        registerPlayer.getPlayerList().forEach(player -> {
            System.out.println(player.getName() + "'s Inventory:");
            player.getInventoryList().forEach(item -> {
                System.out.println("  " + item.getItemName());
            });
        });
    }
}
