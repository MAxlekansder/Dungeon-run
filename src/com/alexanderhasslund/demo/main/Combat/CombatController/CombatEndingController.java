package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class CombatEndingController {

    public void decideCombatWinner(List<Player> playerList,int calculateLevels) {
        ResetCombat resetCombat = new ResetCombat();
        if (playerList.isEmpty()) {
            System.out.println("Seems like you didnt make it further than here... ");
            System.out.println("too bad... better luck next time, hero");
            // save a file here
            // break this loop

        }
        else {

            System.out.printf("You it made through leve %s! \n", calculateLevels);
            resetCombat.resetPlayerBackToNormal(playerList);
            System.out.println("Restoring health and resource back to full");

        }

    }
}
