package com.alexanderhasslund.demo.main.Monster.Boss.TagTeam;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class TagTeam extends Monster implements IMonster, ICombat {


    //either they all have 3 bosses, or all together, shared health pool
    public TagTeam() {
        super("THE VERMIN TAG TEAM: Skarrik, Rasknitt and DeathRattler", 10,10,120,40,25, 0, false, 0,400,0,false,0);
    }


    @Override
    public void spells() {
      // tag team frenzy
        // either they always attack as 3 or this spell would be doing the tag team damage and have a multiplier?
    }

    @Override
    public void attack(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster) {

    }

    @Override
    public void getStatus() {

    }
}
