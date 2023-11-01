package com.alexanderhasslund.demo.main.Levels;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Monster.MonsterBrute;
import com.alexanderhasslund.demo.main.Monster.MonsterRanger;
import com.alexanderhasslund.demo.main.Monster.MonsterSpellWeaver;

import java.util.ArrayList;
import java.util.List;

public class FloorsAndMonsters {

    private List<Monster> monsterList;

    public FloorsAndMonsters() {
        monsterList = new ArrayList<>();

    }

    public void generateMonsterRand(int numbersOfMonsters) {
        MonsterBrute monsterBrute = new MonsterBrute();
       // MonsterRanger monsterRanger = new MonsterRanger();
        MonsterSpellWeaver monsterSpellWeaver = new MonsterSpellWeaver();

        for (int i = 0; i < numbersOfMonsters; i++) {

            monsterList.add(new MonsterRanger());
        }
    }

}
