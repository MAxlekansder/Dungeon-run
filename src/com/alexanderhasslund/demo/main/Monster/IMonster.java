package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public interface IMonster {

    // det går att implementera klassen direkt i interface metoder
    // ha egna private attributes för dem i klassen
    public void spells();
    public void damageMultiplierForLevel();
    // damage level?

    public void calculateChanceToBlock(List<Player> playerList, Player player, List<Monster> monsterList, Monster monster);

}
