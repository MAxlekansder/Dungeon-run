package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.Comparator;

public class WindowInitiativComperator implements Comparator<InitiativeListView> {


    @Override
    public int compare(InitiativeListView o1, InitiativeListView o2) {

        return o1.getInitiative() - o2.getInitiative();

    }
}
