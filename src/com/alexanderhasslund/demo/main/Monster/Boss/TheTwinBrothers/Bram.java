package com.alexanderhasslund.demo.main.Monster.Boss.TheTwinBrothers;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Monster.Boss.Boss;
import com.alexanderhasslund.demo.main.Monster.IMonster;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Bram extends Monster implements IMonster, ICombat {

    public Bram() {
        super("THE TWIN BROTHERS - Bram",0,0,100,0,40,0,false,0,200,0,false,0);
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
