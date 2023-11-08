package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class ResetCombat {

    public void resetPlayerListBackToNormal(List<Player> playerList) {
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

    public void resetPlayerBackToNormal(Player currentPlayer) {
        Barbarian barbarian = new Barbarian();
        Sorcerer sorcerer = new Sorcerer();
        Rogue rogue = new Rogue();


        if (currentPlayer instanceof Barbarian) {
            currentPlayer.setResource(barbarian.getResource());
            currentPlayer.setHp(barbarian.getHp());
            currentPlayer.setHasPlayed(false);

        } else if (currentPlayer instanceof Rogue) {
            currentPlayer.setResource(rogue.getResource());
            currentPlayer.setHp(rogue.getHp());
            currentPlayer.setHasPlayed(false);

        } else if (currentPlayer instanceof Sorcerer) {
            currentPlayer.setResource(sorcerer.getResource());
            currentPlayer.setHp(sorcerer.getHp());
            currentPlayer.setHasPlayed(false);
        } else {
            System.out.println("No class found... ");
        }
    }
}
