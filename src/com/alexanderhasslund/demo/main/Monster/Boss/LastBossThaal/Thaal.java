package com.alexanderhasslund.demo.main.Monster.Boss.LastBossThaal;

import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;

public class Thaal extends Monster implements IMonster {


    public Thaal() {
        super("\033[1;36mFINAL BOSS\033[0m","THE GRAND EMPEROR - Thaal",0,0,0,0,0,0,false,0,1000,0,false,0);
    }

    @Override
    public void spells() {

    }
}
