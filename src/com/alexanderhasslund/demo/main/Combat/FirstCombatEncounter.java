package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Combat.CombatController.CombatController;
import com.alexanderhasslund.demo.main.Combat.CombatController.MonsterAttack;
import com.alexanderhasslund.demo.main.Combat.CombatController.ResetCombat;
import com.alexanderhasslund.demo.main.Monster.BasicMonsters.MonsterBrute;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class FirstCombatEncounter {

    private List<Player> playerList;
    private int playerCount;



    public FirstCombatEncounter(List<Player> playerList, int playerCount) {
        this.playerList = playerList;
        this.playerCount = playerCount;
    }

    public void firstPlayerFight() {
        List<Monster> firstMonsterList = new ArrayList<>();
        firstMonsterList.add(new MonsterBrute());

        firstMonsterList.get(0).setHp(10);
        firstMonsterList.get(0).setInitiative(1);
        
        System.out.println
                ("""
                This is your first encounter - and to be nice, the monster you're fighting has,
                should we say... been modified... 
                
                BUT! to see how the game play plays out, the monster start... 
                
                You now have the option to explore every option during combat
                """);

        CombatController combatController = new CombatController(playerList, firstMonsterList);
        combatController.initiateFight();

        System.out.println
                ("""
                Good job! 
                
                As you might have understood, this was a mockup encounter... but im bit nice, and might play in your
                favor... 
                """);

        for (Player player : playerList) {
            System.out.println(player.getName() + " gets 200 coins! and some exp");
            player.setCurrency(200);
        }

        ResetCombat resetCombat = new ResetCombat();
        resetCombat.resetPlayerBackToNormal(playerList);
        System.out.println("This might help you... for now...");
    }


}
