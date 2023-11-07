package com.alexanderhasslund.demo.main.Monster.BasicMonsters;

import com.alexanderhasslund.demo.main.Levels.LevelController;
import com.alexanderhasslund.demo.main.Monster.Monster;

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



    public void monsterValueController() {
        LevelController levelController = new LevelController();
        Random rand = new Random();

        countFloors = 1 + levelController.getCountLevels();
        countMonsters = (2 * getCountPlayers()) + rand.nextInt(0,1);

        List<Monster> allMonsters = new ArrayList<>();
        allMonsters.add(new MonsterRanger());
        allMonsters.add(new MonsterBrute());
        allMonsters.add(new MonsterSpellWeaver());
        randomizeMonster(countMonsters, allMonsters);
    }


    public void randomizeMonster(int countMonsters, List<Monster> allMonsters) {
        Random rand = new Random();

        for (int i = 0; i < countMonsters; i++) {
            int monsterIndex = rand.nextInt(allMonsters.size());
            Monster firstMonster = allMonsters.get(monsterIndex);

            if (firstMonster instanceof MonsterBrute) {
                firstMonster = new MonsterBrute();
            } else if (firstMonster instanceof MonsterRanger) {
                firstMonster = new MonsterRanger();
            } else if (firstMonster instanceof MonsterSpellWeaver) {
                firstMonster = new MonsterSpellWeaver();
            }

            firstMonster.setMonsterId(i);
            monsterList.add(firstMonster);

        }
    }


    public List<Monster> getMonsterList() {
        return monsterList;
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

    public int getCountPlayers() {
        return countPlayers;
    }

}
