package com.alexanderhasslund.demo.main.Monster.Boss;

import com.alexanderhasslund.demo.main.Monster.IMonster;

public class BossTagTeam extends Boss implements IMonster {


    //either they all have 3 bosses, or all together, shared health pool
    public BossTagTeam() {
        super("THE VERMIN TAG TEAM: Skarrik, Rasknitt and DeathRattler", 10, 10,250, 40, 25, 0, 0, 0,false,false);
    }


    @Override
    public void spells() {
      // tag team frenzy
        // either they always attack as 3 or this spell would be doing the tag team damage and have a multiplier?
    }

    @Override
    public void damageMultiplierForLevel() {

    }
}
