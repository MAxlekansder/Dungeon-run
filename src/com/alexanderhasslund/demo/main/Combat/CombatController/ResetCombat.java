package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class ResetCombat {

    public void resetPlayerBackToNormal(List<Player> playerList) {
        Barbarian barbarian = new Barbarian();
        Sorcerer sorcerer = new Sorcerer();
        Rogue rogue = new Rogue();

        for (Player player : playerList) {
            if (player instanceof Barbarian) {
                player.setResource(barbarian.getResource());
                player.setHp(barbarian.getHp());
                player.setHasPlayed(false);

            } else if (player instanceof Rogue) {
                player.setResource(rogue.getResource());
                player.setHp(rogue.getHp());
                player.setHasPlayed(false);

            } else if (player instanceof Sorcerer) {
                player.setResource(sorcerer.getResource());
                player.setHp(sorcerer.getHp());
                player.setHasPlayed(false);
            } else {
                System.out.println("No class found... ");
            }
        }
    }
}
