package com.alexanderhasslund.demo.main.File;
import com.alexanderhasslund.demo.main.Engine.StringManipulator;

import static com.alexanderhasslund.demo.main.Engine.Color.*;

public class StringLore {

    public String intro() {
        StringManipulator stringManipulator = new StringManipulator();


        return ("""
                'QUICK! The princess have been kidnapped...         
                Stowed away and locked in the dungeon darkest!' shouts a distressed citizen 
                'Someone needs to save the princess!!' another one yells
                                
                In the quite town where nothing really happens, chaos abruptly spews out from the sewers and gutters
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
            Thread.sleep(200);
        }
    }


    public String gameIntroduction() {
        return ("""
                Welcome Hero! 
                """);
    }
}
