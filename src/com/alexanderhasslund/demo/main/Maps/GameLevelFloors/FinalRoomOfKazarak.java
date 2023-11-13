package com.alexanderhasslund.demo.main.Maps.GameLevelFloors;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.File.SaveFile;
import com.alexanderhasslund.demo.main.Monster.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.StringLore;

import java.util.List;

public class FinalRoomOfKazarak {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public FinalRoomOfKazarak(int calculateLevels, List<Player> playerList, int countPlayers) {
        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public boolean startUpGameFour() {
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, monsterController.getMonsterList());
        StringManipulator stringManipulator = new StringManipulator();
        SaveFile saveFile = new SaveFile();

        stringManipulator.manipulateString(StringLore.theFinalRoomThaal());
        stringManipulator.manipulateString(StringLore.bossIntroThaal());

        boolean checkPlayerEncounter = false;

          stringManipulator.manipulateString(StringLore.bossLastBossThaal());

          monsterController.chooseBossFight(calculateLevels);
          if(  checkPlayerEncounter = combatController.initiateFight()) {

              saveFile.saveHistoricPlayer(playerList);
              stringManipulator.manipulateString(StringLore.theFinalRoomThaal());
          } else {

          }


        saveFile.saveHistoricPlayer(playerList);
        return checkPlayerEncounter;
    }
}
