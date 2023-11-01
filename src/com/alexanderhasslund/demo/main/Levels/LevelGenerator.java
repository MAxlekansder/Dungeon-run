package com.alexanderhasslund.demo.main.Levels;

import com.alexanderhasslund.demo.main.Monster.Monster;

import java.util.List;

public class LevelGenerator {

    private List<Monster> monsterList;

    public LevelGenerator(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public void generateLevels() {
        System.out.println("in generate Levels");
        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println(monsterList.get(i).getMonsterName());
        }




    }

}
