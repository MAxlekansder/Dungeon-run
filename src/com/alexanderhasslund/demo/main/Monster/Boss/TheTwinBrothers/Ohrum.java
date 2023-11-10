package com.alexanderhasslund.demo.main.Monster.Boss.TheTwinBrothers;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Ohrum extends Monster implements IMonster, ICombat {


    public Ohrum() {
        super("\033[1;36mBOSS\033[0m","THE TWIN BROTHERS - Oh'rum",100,0,7,0,60,0,false,0,300,0,false,0);
    }

    @Override
    public void spells() {

    }

    @Override
    public void attack(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster) {

    }

    @Override
    public void getStatus() {

    }
}
