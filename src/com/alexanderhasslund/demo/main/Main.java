package com.alexanderhasslund.demo.main;

public class Main {


    public static void main(String[] args) {
    // how do you balance a game like this? if 1 is stronger and 3 spawns?
    // based on how many players and exp rounded down? <- new game plus should have rounded up.

    // how should they fight? Random within restriction based on classes best attribute?
            // agi => fights with agi but gets more armor from str <- look inte what int gives
            // str => fights with str but gets more evasion from agi <- look inte what int gives
            // int => fights with int but gets more armor from str and more evasion from agi
                                        // or that cheat code is playing int-hero?
                                        // less scaling on AGI and STR compared to agi and str hero

        // Player
            // name
            // experience
            // stats - agility / intellect / strength
                        // rage / energy / mana <- belong to Classes
            // HP
            // Currency
            // Initiative?
            // Damage
                // List for items
                // List for talent tree
                // List for inventory slots

        // Monster
            // stats - agility / intellect / strength
                   // rage / energy / mana <- belong to Classes
            // HP
            // Initiative?
            // Damage

        // Classes
            // Barb
            // Thief <- extra loot? Everyone should have its own trait
            // Warlock

            // Blood mage <- uses HP to fight and regenerates when something dies?
            // Tinker <- Traps and fire over time?
            // Monk <- Shield, like disc priest but with fists

        // Inventory
            // have at least 5 slots
            // main hand ( can be two-handed and that would fil the slot up ) <- look into it
            // offhand
            // armour (counts everything)
            // ring
            // boots? <- see over last alternative

        // Items
            // Base item
                // Sword
                // Shield
                // Potion

            // mid-tier item
            // late-game item
            // divine item
            // random out stats? <- reroll item?

        // Levels
            // random per map
            // harder each level
            // new game + when game over

        // Shop
            // secret shop / per level
            // unlock tiers per exp or level reached

        // Rewards

        // Talent tree

        // ICombat
            //fighting
                // attack
                // flee
                // getStatus
                // win or loose
                // check when HP == 0, if?

        //write to file
            // save game - but when its over, it's over
            // save to file when game ends, include date and build scoreboard for longest lasting
                    // base on EXP? easiest way to do it?
            // be able to 'continue'

    }
}