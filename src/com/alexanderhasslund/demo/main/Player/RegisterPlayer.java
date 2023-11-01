package com.alexanderhasslund.demo.main.Player;
import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.PlayerInteraction.PlayerChoice;
import com.alexanderhasslund.demo.main.Shop.ShopMenu;
import com.alexanderhasslund.demo.main.Shop.Weapon.SwordsShop;

import java.util.ArrayList;
import java.util.List;


public class RegisterPlayer {
    private List<Player> playerList;
    private int countPlayers;

    public RegisterPlayer() {
        this.playerList = new ArrayList<>();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }

    public void playerCount() {
        System.out.print("\nPlease enter number of players: ");
        setCountPlayers(Input.intInput());

    }


    public void chooseClass() {
        for (int i = 0; i < getCountPlayers(); i++) {

            PlayerChoice playerChoice = new PlayerChoice();
            System.out.println(playerChoice.nameAndClass());
            boolean choice = true;
            do {
                switch (Input.intInput()) {
                    case 1 -> {addPlayer( new Barbarian());choice = false;}
                    case 2 -> {addPlayer( new Rogue());choice = false;}
                    case 3 -> {addPlayer( new Sorcerer());choice = false;}
                    default -> {System.out.println("Use right input");}

                }
            } while (choice);
        }
    }

    public void choosePlayerName() {
        for ( int i = 0; i < getCountPlayers(); i++) {
            System.out.printf("Enter character name, for player %s: ", (i + 1));
            playerList.get(i).setName(Input.stringInput());
            playerList.get(i).setId(i);
            playerList.get(i).setCurrency(200);
        }
        System.out.print("\n");
    }


    public List<Player> getPlayerInformation() {
        for (int i = 0; i < playerList.size(); i++) {

            System.out.println(
                    " Name = " + playerList.get(i).getName() + "  || "
                  + " Class name = " + playerList.get(i).getClassName() + "  || "
                  + " Damage = " + playerList.get(i).getDamage() + "  || "
                  + " Currency = " + playerList.get(i).getCurrency() + "  || "
                  + " Experience = " + playerList.get(i).getExperience() + "  || "
                  + " ID = " + playerList.get(i).getId()
            );

            //System.out.println(playerList.get(i));
        }
        return playerList;
    }

    /*
    public void addItem() {
        ShopMenu shopMenu = new ShopMenu(getPlayerList());
        //SwordsShop swordsShop = new SwordsShop(getPlayerList());
        //swordsShop.swordsShopSwitch();
        shopMenu.basicShopMenu();


        for (int i = 0; i < playerList.size(); i++) {
            //playerList.get(i).getInventoryList().add(sword);
            //playerList.get(i).getInventoryList().add(swords.fastSword());
            System.out.println(playerList.get(i).getInventoryList());
        }
    }

     */
}


