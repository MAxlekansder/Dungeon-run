package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Fight  {

    private List<Player> playerList;

    public void fightMonster(List<Player> playerList) {
        int fightSequence = Input.intInput();
        switch (fightSequence) {
            case 1 -> {
                playerList.stream().filter(player -> player instanceof ICombat).forEach(player -> ((ICombat) player).attack());
            }
            case 2 -> {
                playerList.stream().filter(player -> player instanceof IClasses).forEach(player -> ((IClasses) player).spells());
            }
        }
    }


}

    /*
        for (Player player : playerList) {
            if (player instanceof ICombat) {
               ((ICombat) player).attack();
            }
        }

        for (Player player: playerList) {
            if (player instanceof IClasses) {
                ((IClasses) player).spells();

            }
        }

     */