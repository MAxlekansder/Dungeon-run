package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Inventory.Inventory;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

import java.util.List;

public class ShopMenu {

    public void basicShopMenu() {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        Player player = new Player();
        switch(Input.intInput()) {
            case 1 -> {
                registerPlayer.getPlayerList();
                registerPlayer.getPlayerList().;
            }
            case 2 -> {
                player.getInventoryList();
                //player.setInventoryList();

            }
        }
    }
}
