package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Levels.LevelController;
import com.alexanderhasslund.demo.main.Levels.LevelGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterController {

    private List<Monster> monsterList;
    private int countFloors;
    private int countMonsters;
    private int countPlayers;


    public MonsterController(int countPlayers) {
        this.countPlayers = countPlayers;
        this.monsterList = new ArrayList<>();
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
        LevelController levelController = new LevelController();

        countFloors = 1 + levelController.getCountLevels();
        countMonsters = (2 + levelController.getCountLevels()) * countPlayers;


        List<Monster> allMonsters = new ArrayList<>();
        allMonsters.add(new MonsterRanger());
        allMonsters.add(new MonsterBrute());
        allMonsters.add(new MonsterSpellWeaver());
        randomizeMonster(getCountMonsters(), allMonsters);
    }


    public void randomizeMonster(int countMonsters, List<Monster> allMonsters) {

        Random rand = new Random();

        for (int i = 0; i < countMonsters; i++) {

            int monsterIndex = rand.nextInt(0, 2) + allMonsters.size();
            Monster monster = allMonsters.get(monsterIndex);
            monsterList.add(monster);

        }

        LevelGenerator levelGenerator = new LevelGenerator(monsterList);
        levelGenerator.generateLevels();
    }


    public List<Monster> getMonsterList() {
        return monsterList;
    }


}
