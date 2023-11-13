package com.alexanderhasslund.demo.main.Maps.GameLevelFloors;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.Monster.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.StringLore;

import java.util.List;

public class UpperPlateau {
    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;


    public UpperPlateau(int calculateLevels, List<Player> playerList, int countPlayers) {

        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public boolean startUpGameTwo() {
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, monsterController.getMonsterList());
        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.manipulateString(StringLore.reachingUpperPlateau());

        monsterController.monsterValueController();
        combatController.initiateFight();


        stringManipulator.manipulateString(StringLore.bossTwinBrothers());

        monsterController.chooseBossFight(calculateLevels);
        boolean checkPlayerEncounter = combatController.initiateFight();
        // sout a "you killed the first boss... give rewards etc etc


        // trigger same as in maingameMenu
        return checkPlayerEncounter;

    }
}
