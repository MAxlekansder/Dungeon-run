package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class CombatEndingController {

    private int calculateLevels;

    public CombatEndingController(int calculateLevels) {
        this.calculateLevels = calculateLevels;
    }

    public void decideCombatWinner(List<Player> playerList) {
        ResetCombat resetCombat = new ResetCombat();
        if (playerList.isEmpty()) {
            System.out.println("Seems like you didnt make it further than here... ");
            System.out.println("too bad... better luck next time, hero");
            // save a file here
            // break this loop

        }
        else {
            System.out.printf("You it made through level %s! \n", calculateLevels);
            resetCombat.resetPlayerListBackToNormal(playerList);
            calculateLevels++;
            System.out.println("Restoring health and resource back to full");
        }
    }
}
