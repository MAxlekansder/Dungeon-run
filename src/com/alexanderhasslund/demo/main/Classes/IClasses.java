package com.alexanderhasslund.demo.main.Classes;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public interface IClasses {

    public void trait(List<Player> playerList, int playerIndex, List<Monster> monsterList);
    public void spells(List<Player> playerList, int playerIndex, List<Monster> monsterList);
    public void setLevelUp();



}
