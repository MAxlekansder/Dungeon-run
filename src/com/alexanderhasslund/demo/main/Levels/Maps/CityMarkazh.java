package com.alexanderhasslund.demo.main.Levels.Maps;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;
import com.alexanderhasslund.demo.main.Levels.GameLevel;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterController;
import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.PlayerInteraction.StringLore;

import java.util.ArrayList;
import java.util.List;

public class CityMarkazh extends GameLevel {

    private int calculateLevels;
    private List<Player> playerList;
    private List<Boss> bossList;
    private int countPlayers;


    public CityMarkazh(int calculateLevels, List<Player> playerList, int countPlayers) {

        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
        this.bossList = new ArrayList<>();
    }

    public boolean startUpGameThree() {
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, monsterController.getMonsterList());
        StringManipulator stringManipulator = new StringManipulator();
        monsterController.monsterValueController();
        combatController.initiateFight();


        stringManipulator.manipulateString(StringLore.bossTagTeam());

        monsterController.chooseBossFight(calculateLevels);
        boolean checkPlayerEncounter = combatController.initiateFight();
        // sout a "you killed the first boss... give rewards etc etc


        // trigger same as in maingameMenu
        return checkPlayerEncounter;
    }
}

