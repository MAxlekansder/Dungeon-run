package com.alexanderhasslund.demo.main.Levels.Maps;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Levels.GameLevel;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterController;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class TheHallsOfKaraz extends GameLevel {

    private int calculateLevels;
    private List<Player> playerList;
    private int countPlayers;

    public TheHallsOfKaraz(int calculateLevels, List<Player> playerList, int countPlayers) {

        this.calculateLevels = calculateLevels;
        this.playerList = playerList;
        this.countPlayers = countPlayers;
    }

    public void startUpGameOne() {
        MonsterController monsterController = new MonsterController(countPlayers);
        CombatController combatController = new CombatController(playerList, monsterController.getMonsterList());
        monsterController.monsterValueController();
        combatController.initiateFight();
        // trigger same as in maingameMenu


    }


}
