package com.alexanderhasslund.demo.main.Engine;

import com.alexanderhasslund.demo.main.Classes.Barbarian;
import com.alexanderhasslund.demo.main.Classes.Rogue;
import com.alexanderhasslund.demo.main.Classes.Sorcerer;
import com.alexanderhasslund.demo.main.File.StringLore;
import com.alexanderhasslund.demo.main.Player.Player;
import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class GameStartControl {


    public void startIntroductionGame() throws InterruptedException {
       RegisterPlayer registerPlayer = new RegisterPlayer();
        StringLore stringLore = new StringLore();


        stringLore.gameTitle();
        System.out.println(stringLore.gameIntroductionClasses());

        Barbarian barbarian = new Barbarian();
        System.out.println(barbarian);
        Rogue rogue = new Rogue();
        System.out.println(rogue);
        Sorcerer sorcerer = new Sorcerer();
        System.out.println(sorcerer);

        registerPlayer.playerCount();
        registerPlayer.chooseClass();
        registerPlayer.getPlayerInformation();

    }

}
