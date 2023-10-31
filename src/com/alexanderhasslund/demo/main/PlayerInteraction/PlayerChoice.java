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
                                
                \033[1;36mSWORDS            SHIELDS               POTIONS\033[0m
                provides more     provides protection   provides temporary
                damage towards    during combat         buffs during combat
                your enemies      chance to block
                             
                """);
    }

    public String insideShop() {
        return ("""
                
                1. SWORDS - provides more damage towards your enemies 
                2. SHIELDS - provides protection during combat and some shields have a chance to block
                3. POTIONS - provides temporary buffs during combat
                """);
    }

    public String swordsMenu() {
        return ("""
                WELCOME TO THE SWORD SHOP
                
                \033[1;36m1.STANDARD SWORD     \033[1;34m2.FAST SWORD               \033[1;35m3.SHARP SWORD         \033[1;33m4.DIVINE SWORD\033[0m             
                \033[1;37mTHE TRUSTY SWORD     FOR THE FAST ATTACKER      THE TACHI BLADE       THE ONE TRUE BLADE\033[0m    
                
                Damage 6             Damage 4                   Damage 20             Damage 60
                Initiative 40        Initiative 60              Initiative 55         Initiative 85
                Level lock 0         Level lock 2               Level lock 5          Level lock 15
                
                Price: 200           Price: 500                 Price: 1000           Price: 15000 
                """);
    }


    public String shieldsMenu() {
        return (""" 
                WELCOME TO THE SHIELD SHOP
                
                \033[1;36m1.STANDARD SHILED      \033[1;34m2.BULK SHILED                   \033[1;35m3.SPIKED SHIELD           \033[1;33m4.DIVINE SHIELD\033[0m             
                \033[1;37mTHE TRUSTY SHIELD      YOU'RE NOT GETTING THROUGH      BITE ME, ILL BITE BACK    SVALINN, THE SUN EATER\033[0m 
                
                Defence 5              Defence 10                      Defence 15                Defence 40
                Block 1                Block 1                         Block 5                   Block 30
                Level lock 0           Level lock 2                    Level lock 5              Level lock 15
                
                Price: 200             Price: 500                      Price: 1000               Price: 15000 
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