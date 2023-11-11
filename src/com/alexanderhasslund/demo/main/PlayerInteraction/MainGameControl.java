package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Combat.CombatController.CombatEndingController;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Shop.ShopMenu;

import java.io.IOException;
import java.util.List;

public class MainGameControl {

    private List<Player> playerList;
    //private List<Monster> monsterList;
    private int countPlayers;

    public MainGameControl(List<Player> playerList, int countPlayers) {
        this.playerList = playerList;
        this.countPlayers = countPlayers;
        //  this.monsterList = monsterList;
    }


    public void mainSwitch() throws IOException, NoSuchFieldException, IllegalAccessException {
        PlayerChoice playerChoice = new PlayerChoice();
        ShopMenu shopMenu = new ShopMenu(playerList); // this line becomes null, seems like something is wrong
        //SaveFile saveFile = new SaveFile(playerList);
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, monsterController.getMonsterList());
        CombatEndingController combatEndingController = new CombatEndingController();
        GameLevelMenu gameLevelMenu = new GameLevelMenu(combatEndingController.getCalculateLevels(), playerList, countPlayers);
        boolean isMainPlaying = true;
        while (isMainPlaying) {
            System.out.println(playerChoice.mainMenuChoice());
            switch (Input.intInput()) {
                case 1 -> {
                    // continue
                    // this method call is only for test, this might be in levelGenerator
                    isMainPlaying = gameLevelMenu.gameViewSwitch();

                    /*
                    monsterController.monsterValueController();
                    combatController.initiateFight(); */
                }
                case 2 -> {
                    // shop
                    shopMenu.mainShopMenu();

                }
                case 3 -> {
                    //saveFile.saveFilePlayer();
                }
                case 4 -> {

                    for (int i = 0; i < playerList.size(); i++) {
                        System.out.println(
                                Color.WHITE + playerList.get(i).getName().toUpperCase() + Color.RESET +
                                        Color.WHITE + " Current level: " + Color.PURPLE + playerList.get(i).getLevel() + Color.RESET +
                                        Color.WHITE + " Current currency:  " + Color.YELLOW + playerList.get(i).getCurrency() + Color.RESET +
                                        Color.WHITE + " Current experience " + Color.CYAN + playerList.get(i).getExperience() + Color.RESET +

                                        "       " + playerList.get(i).getClassName() + "  ||  " +
                                        " Damage = " + (playerList.get(i).getDamage() + playerList.get(i).getInventoryList().get(0).getDamage() + playerList.get(i).getInventoryList().get(1).getDamage()) + "  ||  " +
                                        " Resource = " + playerList.get(i).getResource() + "  ||  " +
                                        " Strength = " + playerList.get(i).getStrength() + "  ||  " +
                                        " Agility = " + playerList.get(i).getAgility() + "  ||  " +
                                        " Intellect = " + playerList.get(i).getIntellect() + "  ||  " +
                                        " Initiative = " + playerList.get(i).getInitiative() + "  ||  "
                        );
                    }
                }

                case 5 -> {
                    // current level
                    if (!isMainPlaying) {
                        isMainPlaying = false;
                    }
                }
                case 6 -> {
                    // quit game
                    isMainPlaying = false;
                }
                default -> {
                    System.out.println("error");
                }
            }
        }

    }
}
