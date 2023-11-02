package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Levels.LevelGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterGenerator {

    private List<Monster> monsterList;

    public MonsterGenerator() {
        monsterList = new ArrayList<>();
    }

    public void randomizeMonster(int countMonsters, List<Monster> allMonsters) {

        Random rand = new Random();

        for (int i = 0; i < countMonsters; i++) {

            int monsterIndex = rand.nextInt(0,2) + allMonsters.size();
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
























  /*
        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(
                    monsterList.get(i).getMonsterName() + " HP " +
                            monsterList.get(i).getHp() + " Init " +
                            monsterList.get(i).getInitiative() + " Damage " +
                            monsterList.get(i).getDamage());
        }


                    monsterList.get(0).setDamage(monsterList.get(0).getDamage()-5);
                    monsterList.get(0).setHp(monsterList.get(0).getHp() -20);


        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(
                    "Damage done " +
                    monsterList.get(i).getMonsterName() + " HP " +
                            monsterList.get(i).getHp() + " Init " +
                            monsterList.get(i).getInitiative() + " Damage " +
                            monsterList.get(i).getDamage());
        }

         */
