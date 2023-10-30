package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Engine.GameStartControl;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.File.SaveFile;
import com.alexanderhasslund.demo.main.Player.Player;

import java.io.IOException;
import java.util.List;

public class StartMenu {

    private List<Player> playerList;

    public StartMenu() {

    }
    public StartMenu(List<Player> playerList) {
        this.playerList = playerList;
    }
    //switch här

    public void mainGameSwitch() throws InterruptedException, IOException {
        GameStartControl gameStartControl = new GameStartControl();
        MainGameMenu mainGameMenu = new MainGameMenu(playerList);
        PlayerChoice playerChoice = new PlayerChoice();
        boolean isPlaying = true;


        // introduce same logic here as in playerChoice with blacking out continue save...
        do {
            playerChoice.startMenuChoice();
            switch(Input.intInput() ) {
                case 1 -> {
                    // start new game
                        // while in this menu -> only loop that switch
                        // do a check to see if playerList exists?
                    gameStartControl.startIntroductionChoice();

                    mainGameMenu.mainSwitch();

                }
                case 2 -> {
                    // continue
                    // load into the save
                        // if no save file exists, make the text grey...
                }
                case 3 -> {
                    // save
                }
                case 4 -> {
                    // display highscore
                }
                case 5 -> {
                    isPlaying = false;
                }
            }
        } while (isPlaying);
    }

}
