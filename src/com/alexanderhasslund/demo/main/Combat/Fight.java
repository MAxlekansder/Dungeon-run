package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Classes.IClasses;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;
import java.util.stream.IntStream;

public class Fight {

    private List<Player> playerList;

    public void fightMonster(List<Player> playerList, int playerIndex, List<Monster> monsterList) {
        int fightSequence = Input.intInput();
        switch (fightSequence) {
            case 1 -> {

                IntStream.range(0, playerList.size()).filter(index -> index == playerIndex).forEach(index -> {
                            Player player = playerList.get(playerIndex);
                            if (player instanceof ICombat) {
                                ((ICombat) player).attack(playerList, playerIndex, monsterList);
                            }
                        }
                );
            }

            case 2 -> {
                IntStream.range(0,playerList.size()).filter(index -> index == playerIndex).forEach(index -> {
                    Player player = playerList.get(playerIndex);
                    if (player instanceof IClasses) {
                        ((IClasses) player).spells();
                    }
                });
            }

            case 3 -> {
                System.out.println("back to menu");
            }
        }
    }
}

