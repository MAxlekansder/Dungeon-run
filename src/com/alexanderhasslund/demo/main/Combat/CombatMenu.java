package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Engine.Input;

public class CombatMenu {

    Input input;

    //Introduce a fighting sequence...
    /*
    Welcome hero!

    This is your first time figting, therefor ill just let you know how the combat works...
    you get some alternatives. As mentioned, every class has their own ability and also a trait...

    Base Attack() is just Attacking without consequences of your resource manangement...

    CASE 1: Fight! This will present a new menu with the alternative to ATTACK or use SPELLS
    CASE 2: GET STATUS - lets you see how your heros HP and resource
    CASE 3: FLEE! This fight was maybe too hard? or you forgot to use the shop to upgrade...

    Thats it for now... Lets see how the first Fight goes!

    Remember, killing a monster will grant you both experience for leveling and currency to spend in the shop
    Each floor gets progressively hard for each floor your clear ... and finally meet a boss

    Good luck...
     */

    public void fightMonster() {
        Fight fight = new Fight();
        int fightInput = input.intInput();
        switch (fightInput) {
            case 1 -> {
                System.out.println("fight");

            }
            case 2 -> {
                System.out.println("get status");
            }
            case 3 -> {
                System.out.println("flee");
                // calculate if you get away
            }
            default -> {
                System.out.println("use the right input");
            }
        }


    }
}
