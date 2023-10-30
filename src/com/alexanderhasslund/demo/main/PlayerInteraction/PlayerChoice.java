package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class PlayerChoice {

    public String nameAndClass() {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        return ("""
                Please choose a class: 
                1. Barbarian     2.Rogue     3.Sorcerer""");
    }

    public String mainShop() {
        return ("""
                "Welcome to the main shop!
            
                In here you have the option to buy new equipment. 
                These three different categories provides different bonus stats while in combat
                
                1. SWORDS - provides more damage towards your enemies 
                2. SHIELDS - provides protection during combat and some shields have a chance to block
                3. POTIONS - provides temporary buffs during combat
                
                """);
    }

    public String swordsMenu() {
        return ("""
                
                """);
    }

    public String shieldsMenu() {
        return ("""
                
                """);
    }

    public String potionsShop() {
        return ("""
                
                """);
    }

}
