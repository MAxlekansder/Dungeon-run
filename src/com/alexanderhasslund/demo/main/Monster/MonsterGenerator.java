package com.alexanderhasslund.demo.main.Monster;

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

            int monsterIndex = rand.nextInt(allMonsters.size());
            Monster monster = allMonsters.get(monsterIndex);
            monsterList.add(monster);
        }

        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(
                    monsterList.get(i).getMonsterName() + " HP " +
                            monsterList.get(i).getHp() + " Init " +
                            monsterList.get(i).getInitiative() + " Damage " +
                            monsterList.get(i).getDamage());
        }

        for (int i = 0; i < monsterList.size(); i++) {
                    monsterList.get(i).setDamage(monsterList.get(i).getDamage() -5);
                    monsterList.get(i).setHp(monsterList.get(i).getHp() -20);
        }

        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(
                    "Damage done " +
                    monsterList.get(i).getMonsterName() + " HP " +
                            monsterList.get(i).getHp() + " Init " +
                            monsterList.get(i).getInitiative() + " Damage " +
                            monsterList.get(i).getDamage());
        }

    }



    public List<Monster> getMonsterList() {
        return monsterList;
    }
}
