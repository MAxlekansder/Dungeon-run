package com.alexanderhasslund.demo.main.PlayerInteraction;

import com.alexanderhasslund.demo.main.Engine.StringManipulator;

import static com.alexanderhasslund.demo.main.Engine.Color.*;

public class StringLore {

    public String intro() {
        StringManipulator stringManipulator = new StringManipulator();


        return ("""
                'QUICK! The princess have been kidnapped...         
                Stowed away and locked in the dungeon darkest!' shouts a distressed citizen 
                'Someone needs to save the princess!!' another one yells
                                
                In the quite town where nothing really happens, chaos abruptly spews out from the sewers 
                with fell-like substance, swords and mayhem
                obscure creatures raids the city 
                                
                                
                As the fires burns faster, with the town in flames you rush towards your hero deeds
                'Save the princess and save the city' you say to yourself, and with a heroes experience 
                something, or someone must have planned this...
                                
                you see a trail of blood, mud and a substance with a greenish texture leading to a alley. 
                The one alley you've seen so many times before, but never put much thought to it.
                You follow it, but in a snap 
                you fall down
                                
                realizing you're trapped. 
                Stuck in this hell, witnessing a world underneath
                the underworld 
                                
                left alone...
                to die... 
                
                """);
    }

    public void gameTitle() throws InterruptedException {

        for (int i = 0; i < 4; i++) {
            System.out.println(RED + "SAVE PRINCESS BENNY" + RESET);
            Thread.sleep(300);
        }
    }


    public String gameIntroductionClasses() {
        return ("""
                
                Hello Hero! 
                                
                Welcome to the game 'SAVE PRINCESS BENNY' 
                you have 3 classes... to start with.
                -----------------------------------------------------
                \033[1;31mBARBARIAN         \033[1;32mROGUE              \033[1;34mSORCERER\033[0m
                \033[1;37mBERSERKERS RAGE   FOOLS ELUSIVENESS  DRAGONS BREATH\033[0m
                High strength     High agility       High intellect
                High damage       Medium damage      Ramping damage
                High defence      Medium defence     Low defence   
                Low resource      High resource      Ramping resource
                
                -----------------------------------------------------   
                """);
    }

    public String ultimateClassPresentation() {
        return ("""
                
                -----------------------------------------------------   
                \033[1;33mBERSERKERS RAGE                    FOOLS ELUSIVENESS               DRAGONS BREATH\033[0m
                 The barbarian enrages,             The rogue performs a            The sorcerer breathes fire  
                 increasing damage when under       swift attack striking           to every enemy dealing massive
                 30% hp                             2 targets the rogue is          area of effect damage 
                                                    facing, dealing double          **BETA** burning every enemy
                                                    damage. But has a               for 2 rounds
                                                    2 rounds cooldown
                -----------------------------------------------------   
                """);
    }

    public String gameIntroductionRules() {
        return ("""
                
                Each Class have their own unique play style and attributes:
                All have one basic attack that doesnt cost any resource. 
                Two spells that's on a low cost and deals modirate damage 
                One ulitmate as seen above - these spells have works around cooldowns
                while the rest doesnt. 
                
                Every class has a higher set of the main attributes per class -
                
                \033[1;31mStrength\033[0m is an attribute that grants more raw damage and protection
                \033[1;32mAgility\033[0m is an attirubte that give higher initiative and a better chance to dodge
                \033[1;34mIntellect\033[0m is an attribute that gives higher resources and higher scaling damage
                                
                The game have some basic rules, you can either play alone or with a party of 3.
                it's a turned based dungeon crawl, with a rogue-like twist... 
                Uou'll explore the skewering underworld of Azgarak Karaz
                beneath the city of Elderwell
                                
                where both you and the monsters have initative, the lower the number
                the better the chances for you to start the round
                                
                but remember...
                                
                If you die - the game ends
                good luck heroes...
                """);
    }

    public String newGameWakingUp() {
        return ("""
                
                
                """);
    }

    public String bossTagTeam() {
        return("""
                sounding like a horde running towards the last room you just finished
                Like shadows, you see nothing but the sound keeps getting closer
                
                you realise, there's not just one - but three of them...
                
                
                """);
    }

    public String presentHowToPlay() {
        return ("""
                """);
    }
}
