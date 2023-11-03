package com.alexanderhasslund.demo.main.Monster;

import com.alexanderhasslund.demo.main.Player.Player;

public interface IMonster {

    // det går att implementera klassen direkt i interface metoder
    // ha egna private attributes för dem i klassen
    public void spells();
    public void damageMultiplierForLevel();
    // damage level?

}
