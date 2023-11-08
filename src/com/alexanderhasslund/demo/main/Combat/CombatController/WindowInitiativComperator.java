package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.Comparator;

public class WindowInitiativComperator implements Comparator<Object> {


    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof Player && o2 instanceof Player) {
            return Integer.compare((((Player) o1).getInitiative()), (((Player) o2).getInitiative()));
        } else if (o1 instanceof Monster && o2 instanceof Monster) {
            return Integer.compare((((Monster) o1).getInitiative()), ((Monster) o2).getInitiative());
        }
        return 0;


    }
}
