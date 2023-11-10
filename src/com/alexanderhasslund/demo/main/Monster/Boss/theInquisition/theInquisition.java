package com.alexanderhasslund.demo.main.Monster.Boss.theInquisition;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class theInquisition extends Monster implements IMonster, ICombat {


    public theInquisition() {
        super("\033[1;36mBOSS\033[0m","The inqusition", 0, 0, 0,0,0,0,false,200,300,0,false,0);
    }

    @Override
    public void attack(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster) {

    }

    @Override
    public void getStatus() {

    }

    @Override
    public void spells() {

    }
}
