package com.alexanderhasslund.demo.main.Monster;
import com.alexanderhasslund.demo.main.Levels.LevelController;
import com.alexanderhasslund.demo.main.Player.PlayerController;

import java.util.ArrayList;
import java.util.List;

public class MonsterController {

        private int countFloors;
        private int countMonsters;
        private int countPlayers;

    public MonsterController(int countPlayers) {
        this.countPlayers = countPlayers;
    }

    public int getCountFloors() {
        return countFloors;
    }

    public void setCountFloors(int countFloors) {
        this.countFloors = countFloors;
    }

    public int getCountMonsters() {
        return countMonsters;
    }

    public void setCountMonsters(int countMonsters) {
        this.countMonsters = countMonsters;
    }

    public void valueController() {
        MonsterGenerator monsterGenerator = new MonsterGenerator();
        LevelController levelController = new LevelController();

        countFloors = 1 + levelController.getCountLevels();
        countMonsters = (2 + levelController.getCountLevels()) * countPlayers;


        List<Monster> allMonsters = new ArrayList<>();
        allMonsters.add(new MonsterRanger());
        allMonsters.add(new MonsterBrute());
        allMonsters.add(new MonsterSpellWeaver());
        monsterGenerator.randomizeMonster(getCountMonsters(), allMonsters);
    }
}