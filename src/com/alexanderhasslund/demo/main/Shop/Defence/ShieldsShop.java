package com.alexanderhasslund.demo.main.Shop.Defence;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Shop.Defence.Shields;

import java.util.List;
import java.util.stream.IntStream;

public class ShieldsShop {

    private List<Player> playerList;

    public ShieldsShop(List<Player> playerList) {
        this.playerList = playerList;
    }

    // introduce logic so each player can buy
    public void shieldsShopSwitch (int playerIndex) {
        Shields shields = new Shields();
        Player firstPlayer = playerList.get(0);
        Player secondPlayer = playerList.get(1);


        int swordChoice = Input.intInput();
        switch (swordChoice) {
            case 1 -> {
                firstPlayer.getInventoryList().add(1, shields.standardShield());
                playerList.forEach(player -> {
                            player.getInventoryList().add(1, shields.standardShield());
                        }
                );
            }
            case 2 -> {
                playerList.forEach(player -> {
                            player.getInventoryList().add(1, shields.bulkShield());
                        }
                );

            }
            case 3 -> {

                playerList.forEach(player -> {
                            player.getInventoryList().add(1, shields.spikedShield());
                        }
                );
            }
            case 4 -> {
                playerList.forEach(player -> {
                            player.getInventoryList().add(1, shields.divineShield());
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

