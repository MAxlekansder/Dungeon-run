package com.alexanderhasslund.demo.main.PlayerTest;

import com.alexanderhasslund.demo.main.Player.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFile {

    PlayerControllerTest playerControllerTest = new PlayerControllerTest();


    @Test
    @DisplayName("Test adding players")
    public void testAddPlayer() {

        playerControllerTest.chooseClass();
        PlayerTest currentPlayer = playerControllerTest.getPlayerList().get(0);

        //assertEquals(playerControllerTest.getPlayerList());
        System.out.println(currentPlayer);

        assertTrue(!playerControllerTest.getPlayerList().isEmpty());
    }

    @Test
    @DisplayName("Adding experience")
    public void playerAddExperience() {

        playerControllerTest.chooseClass();
        PlayerTest currentPlayer = playerControllerTest.getPlayerList().get(0);

        //System.out.println(currentPlayer.getExperience());
        currentPlayer.setExperience(100);

        assertEquals(100, currentPlayer.getExperience());
    }

    @Test
    @DisplayName("Adding levels")
    public void calculatePlayerLevel() {

        playerControllerTest.chooseClass();
        PlayerTest currentPlayer = playerControllerTest.getPlayerList().get(0);
        currentPlayer.setExperience(22);
        // level up math
        /*
        level =
         */
        //for (int i = currentPlayer.getExperience(); i > 0; i--) {
        int PlayerCurrentExperienceExperince = currentPlayer.getExperience();
        currentPlayer.setExperience(0);
        System.out.println("old strength "+currentPlayer.getStrength());
        System.out.println("old damage "+currentPlayer.getDamage());
        System.out.println("old defence " + currentPlayer.getDefence());
        System.out.println("old HP" + currentPlayer.getHp());

        for (int i = PlayerCurrentExperienceExperince; i > 0; i--) {
            currentPlayer.setExperience(currentPlayer.getExperience()+1);

            if (currentPlayer.getExperience() == 10) {
                currentPlayer.setLevel(currentPlayer.getLevel() +1);
                currentPlayer.setExperience(0);
                //addStatsToPlayer(currentPlayer);

                //trying out level factors and how the math plays out...
                currentPlayer.setStrength(currentPlayer.getStrength() + (int)(currentPlayer.getLevel() / 1.1));
                currentPlayer.setAgility(currentPlayer.getAgility() + (int)(currentPlayer.getLevel() / 0.9));
                currentPlayer.setIntellect(currentPlayer.getIntellect() + (int)(currentPlayer.getLevel() / 2.2));

                currentPlayer.setDamage(currentPlayer.getDamage() + (int)(currentPlayer.getStrength() / 3));
                currentPlayer.setDefence(currentPlayer.getDefence() + (int) (currentPlayer.getStrength() * 0.2));
                currentPlayer.setHp(currentPlayer.getHp()+ (int) (currentPlayer.getStrength() * 0.1));
                /*
                System.out.println(currentPlayer.getStrength());
                System.out.println(currentPlayer.getDamage());
                System.out.println(currentPlayer.getDefence());
                System.out.println(currentPlayer.getHp()); */
            }
        }

        System.out.println("new strength "+currentPlayer.getStrength());
        System.out.println("New damage " +currentPlayer.getDamage());
        System.out.println("New defence" + currentPlayer.getDefence());
        System.out.println("New HP" + currentPlayer.getHp());

        System.out.println(currentPlayer.getExperience());
        assertEquals(3,currentPlayer.getLevel());
        assertEquals(2, currentPlayer.getExperience());
        assertEquals(currentPlayer.getDamage(), 35);

    }
    /*
    @Test
    @DisplayName("Add class stats to player")
    public void addStatsToPlayer(PlayerTest currentPlayer) {

    } */

}
