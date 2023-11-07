package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Monster.Monster;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Flee {


    public void chanceOfFleeing(List<Monster> monsterList) {

        if (!monsterList.isEmpty()) {
            monsterList.removeAll(monsterList);
        }
        // calculate and use this for entire party but monster can flee one by one
        // maybe brute shouldn't be able to flee

    }

}
