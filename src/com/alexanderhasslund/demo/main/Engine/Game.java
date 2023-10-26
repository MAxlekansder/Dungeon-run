package com.alexanderhasslund.demo.main.Engine;

import com.alexanderhasslund.demo.main.Player.Player;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Game {

    // save values to not override when you die
    List<Player> highScoreList = new ArrayList<>();
    List<Player> saveGameList = new ArrayList<>();
    List<Player> saveCharacterList = new ArrayList<>();
    LocalDate date;

    // se också hur vi skriver till en fil och återhämtar filen

    public void saveGame() {

    }

    public void highScore() {

    }

    public void saveCharacter() {
        //if you want to go back to check how it went maybe?
        // Like high score (Alexander with this and this -> expand to see build, tree, item and stats? 
    }
}
