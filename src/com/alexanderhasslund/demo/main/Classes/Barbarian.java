package com.alexanderhasslund.demo.main.Classes;
import java.math.*;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Player.Player;

public class Barbarian extends Player implements IClasses, ICombat {

    private String className;
    private int id;
    private int hp;
    private int damage;
    private int resource;
    private int strength;
    private int agility;
    private int intellect;
    private int level;
    private int defence;
    private int initative;


    public Barbarian() {
        this.className = "BARBARIAN";
        this.id = 1;
        this.hp = 115;
        this.damage = 20;
        this.resource = 100;
        this.strength = 22;
        this.agility = 8;
        this.intellect = 0;
        this.level = 1;
        this.defence = 1;
        this.initative = 55;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void trait() {
        //berserkers rage
        //when hp is below 30 <- activate berserkers rage

        if ( hp <= hp * 0.3) {
            System.out.println("The barbarian gains berserker rage, gaining extra damage");
            while (hp <= hp * 0.3) {
                damage += (int) (damage * 0.07);
            }
        }
    }


    @Override
    public int spells(int choice) {
        int temporaryBuffs = 0;
        switch (choice) {
            case 1 -> { // a baseline damage spell that adds 3 damage and uses 'resources'
                temporaryBuffs = (int) (Math.ceil(damage) + ( 3 * level^level/4));
                System.out.println("Cleaves the target with: " + temporaryBuffs);
                resource -= 20;
            }
            case 2 -> { //
                System.out.println( "The barbarian muster its rage, gaining defence euqal to: " + (defence + 2));
                resource -= 30;
                temporaryBuffs += 2;
            }
            default -> {System.out.println("Use right input");}
        }
        return temporaryBuffs;
    }


    @Override
    public void setLevelUp() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void flee() {

    }

    @Override
    public void getStatus() {

    }

    @Override
    public String toString() {
        return
                Color.RED + className + Color.RESET + ":" +
                        " Hp = " + hp + "  || " +
                        " Damage = " + damage + "  || " +
                        " Resource = " + resource + "  || " +
                        " Strength = " + strength + "  || " +
                        " Agility = " + agility + "  || " +
                        " Intellect = " + intellect + "  || " +
                        " Initiative = " + initative + "  ||"
                ;
    }
}
