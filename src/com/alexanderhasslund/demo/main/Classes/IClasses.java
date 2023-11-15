package com.alexanderhasslund.demo.main.Classes;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public interface IClasses {

    public void ultimate(List<Player> playerList, Player player, List<Monster> monsterList);
    public void spells(List<Player> playerList, Player player, List<Monster> monsterList);
    public void setLevelUp(Player player);
    public void addStatsToPlayer(Player player);

}
