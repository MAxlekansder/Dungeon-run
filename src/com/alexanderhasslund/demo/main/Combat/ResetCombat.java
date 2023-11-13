package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class ResetCombat {

    public void resetPlayerListBackToNormal(List<Player> playerList) {
        Barbarian barbarian = new Barbarian();
        Rogue rogue = new Rogue();

        for (Player player : playerList) {
            if (player instanceof Barbarian) {
                player.setResource(barbarian.getMaxResource());
                player.setAgility(player.getBaseAgility());
                player.setStrength(player.getBaseStrength());
                player.setIntellect(player.getIntellect());
                player.setBaseDamage(player.getBaseDamage());
                player.setHp(player.getMaxHp());
                player.setHasPlayed(false);

            } else if (player instanceof Rogue) {
                player.setResource(rogue.getMaxResource());
                player.setAgility(player.getBaseAgility());
                player.setStrength(player.getBaseStrength());
                player.setIntellect(player.getIntellect());
                player.setBaseDamage(player.getBaseDamage());
                player.setHp(player.getMaxHp());
                player.setHasPlayed(false);

            } else if (player instanceof Sorcerer) {
                player.setResource(player.getMaxResource());
                player.setAgility(player.getBaseAgility());
                player.setStrength(player.getBaseStrength());
                player.setIntellect(player.getIntellect());
                player.setBaseDamage(player.getBaseDamage());
                player.setHp(player.getMaxHp());
                player.setHasPlayed(false);
            } else {
                System.out.println("No class found... ");
            }
        }
    }


    public void resetPlayerBackToNormal(Player currentPlayer) {

        if (currentPlayer instanceof Barbarian) {
            currentPlayer.setResource(currentPlayer.getMaxResource());
            currentPlayer.setAgility(currentPlayer.getBaseAgility());
            currentPlayer.setStrength(currentPlayer.getBaseStrength());
            currentPlayer.setIntellect(currentPlayer.getIntellect());
            currentPlayer.setBaseDamage(currentPlayer.getBaseDamage());
            currentPlayer.setHp(currentPlayer.getMaxHp());
            currentPlayer.setHasPlayed(false);

        } else if (currentPlayer instanceof Rogue) {
            currentPlayer.setResource(currentPlayer.getMaxResource());
            currentPlayer.setAgility(currentPlayer.getBaseAgility());
            currentPlayer.setStrength(currentPlayer.getBaseStrength());
            currentPlayer.setIntellect(currentPlayer.getIntellect());
            currentPlayer.setBaseDamage(currentPlayer.getBaseDamage());
            currentPlayer.setHp(currentPlayer.getMaxHp());
            currentPlayer.setHasPlayed(false);

        } else if (currentPlayer instanceof Sorcerer) {
            currentPlayer.setResource(currentPlayer.getMaxResource());
            currentPlayer.setAgility(currentPlayer.getBaseAgility());
            currentPlayer.setStrength(currentPlayer.getBaseStrength());
            currentPlayer.setIntellect(currentPlayer.getIntellect());
            currentPlayer.setBaseDamage(currentPlayer.getBaseDamage());
            currentPlayer.setHp(currentPlayer.getMaxHp());
            currentPlayer.setHasPlayed(false);
        } else {
            System.out.println("No class found... ");
        }
    }
}
