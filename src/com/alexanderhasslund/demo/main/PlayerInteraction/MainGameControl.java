package com.alexanderhasslund.demo.main.PlayerInteraction;
import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Combat.CombatMenu;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.File.SaveFile;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterController;
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
        SaveFile saveFile = new SaveFile(playerList);
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, countPlayers);
        CombatMenu combatMenu = new CombatMenu();

        boolean isMainPlaying = true;

        //monsterController.randomizeMonster(countPlayer);

        do {
            System.out.println(playerChoice.mainMenuChoice());
            switch (Input.intInput()) {
                case 1 -> {
                    // continue
                   // this method call is only for test, this might be in levelGenerator
                    monsterController.monsterValueController();
                    combatMenu.fightMonster();
                }
                case 2 -> {
                    // shop
                    shopMenu.mainShopMenu();

                }
                case 3 -> {
                     saveFile.saveFilePlayer();
                }
                case 4 -> {

                    for(int i = 0; i < playerList.size(); i++) {
                        System.out.println(
                                Color.WHITE + playerList.get(i).getName().toUpperCase() + Color.RESET +
                                Color.WHITE + " Current level: " + Color.PURPLE  + playerList.get(i).getLevel() + Color.RESET +
                                Color.WHITE + " Current currency:  " + Color.YELLOW + playerList.get(i).getCurrency() + Color.RESET +
                                Color.WHITE + " Current experience " + Color.CYAN + playerList.get(i).getExperience() + Color.RESET +
                                "       " + playerList.get(i));
                    }
                }
                case 5 -> {
                    // current level
                    // current base damage
                    monsterController.monsterValueController();
                    combatController.initiateFight(monsterController.getMonsterList());
                }
                case 6 -> {
                    // quit game
                    isMainPlaying = false;
                }
                default -> {
                    System.out.println("error");
                }
            }
        } while (isMainPlaying);

    }
}
