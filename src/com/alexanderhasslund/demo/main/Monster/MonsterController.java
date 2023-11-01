package com.alexanderhasslund.demo.main.Monster;
import java.util.ArrayList;
import java.util.List;

public class MonsterController {

    public void valueController() {
        MonsterGenerator monsterGenerator = new MonsterGenerator();
        int countFloors = 1;
        int countMonsters = 3;

        List<Monster> allMonsters = new ArrayList<>();
        allMonsters.add(new MonsterRanger());
        allMonsters.add(new MonsterBrute());
        allMonsters.add(new MonsterSpellWeaver());


        monsterGenerator.randomizeMonster(countMonsters, allMonsters);
        monsterGenerator.getMonsterList();
    }

}