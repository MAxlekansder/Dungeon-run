package com.alexanderhasslund.demo.main.Levels;

import com.alexanderhasslund.demo.main.Monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class LevelController {

    private List<LevelGenerator> levelList;
    private int countLevels;

    public int getCountLevels() {
        return countLevels;
    }

    public void setCountLevels(int countLevels) {
        this.countLevels = countLevels;
    }

    public LevelController(List<LevelGenerator> levelList) {
        this.levelList = new ArrayList<>();
    }



}
