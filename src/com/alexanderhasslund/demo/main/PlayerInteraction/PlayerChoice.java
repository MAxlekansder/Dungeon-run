package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class PlayerChoice {

    public String nameAndClass() {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        return ("""
                Please choose a class: 
                1. Barbarian     2.Rogue     3.Sorcerer""");
    }
}
