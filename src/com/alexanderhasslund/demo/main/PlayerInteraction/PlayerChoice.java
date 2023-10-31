package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Player.RegisterPlayer;

public class PlayerChoice {

    public String nameAndClass() {
        RegisterPlayer registerPlayer = new RegisterPlayer();
        return ("""
                Please choose a class: 
                1. \033[1;31mBARBARIAN\033[0m      2.\033[1;32mROGUE\033[0m     3.\033[1;34mSORCERER\033[0m""");
    }

    public String mainShop() {
        return ("""
                "Welcome to the main shop!
                            
                In here you have the option to buy new equipment
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

    public String newGameSetup() {
        return ("""
                \033[1;33mNow, you get the chance to decide how many players 
                and what class each player picks 
                Remember that all players and classes gets saved to the same slot \033[0m
                """);
    }

    public void startMenuChoice() {
        int savedFile = 0; // placeholder
        if (savedFile == 0) {
            System.out.println("""
                                        
                    1. START NEW GAME 
                    \033[0;37m2. CONTINUE SAVE \033[0m
                    3. HIGHSCORE
                    4. QUIT GAME""");
        } else
            System.out.println("""
                                    
                    1. START NEW GAME 
                    2. CONTINUE SAVE
                    3. HIGHSCORE
                    4. QUIT GAME""");
    }


    public String mainMenuChoice() {

        return ("""
                                    
                1. CONTINUE
                2. SHOP
                3. SAVE CURRENT GAME
                4. CURRENT STATUS
                5. CURRENT LEVEL
                6. QUIT TO MAIN MENU
                                    
                """);
    }
}