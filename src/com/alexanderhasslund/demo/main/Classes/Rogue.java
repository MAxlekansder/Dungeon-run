package com.alexanderhasslund.demo.main.Classes;

import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Rogue extends Player implements IClasses, ICombat {

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
    private int initiative;
    private boolean isDead;
    private boolean hasPlayed;


    public Rogue() {
        this.className = Color.GREEN + "ROGUE" + Color.RESET;
        this.hp = 100; // change here and check all control values
        this.id = 0;
        this.damage = 15;
        this.resource = 200;
        this.strength = 8;
        this.agility = 20;
        this.intellect = 2;
        this.level = 1;
        this.defence = 1;
        this.initiative = 40;
        this.isDead = false;
        this.hasPlayed = false;
    }


    @Override
    public void trait(List<Player> playerList, Player currentPlayer, List<Monster> monsterList) {
        //When struck in combat you have a chance to dodge the attack, multiplies defence
        //fools elusiveness
        //count number of rounds and try to get it in here so there's a chance to use the trait
        // maybe put the for loop for rounds in the fighting sequence and not in the spell?
        //(int countrounds?)
        int savePreviousDamage =currentPlayer.getDamage();
        //trigger trait from within the combat menu?
        for (int i = 0; i < 2; i++) {  // while här istället och skicka in antalet rundor (current round trigger round < 2 )
            currentPlayer.setDamage(currentPlayer.getDamage() * 2);
        }
        currentPlayer.setDamage(savePreviousDamage);

        //Cooldown
    }

    @Override
    public void spells(List<Player> playerList, Player currentPlayer, List<Monster> monsterList) {
        switch (1) {
            case 1 -> {
                System.out.printf("Backstabs the target, dealing: %s extra damage and gaining: %s extra defence", 3, 2);
            }
            case 2 -> {
                System.out.printf("Pick pockets the target gaining: %s gold", 1);
            }
            default -> {
                System.out.println("Use right input");
            }
        }
    }

    @Override
    public void setLevelUp() {


    }

    @Override
    public void attack(List<Player> playerList, Player currentPlayer, List<Monster> monsterList, Monster monster) {
        int monsterChoice = 1;

        for (Monster monster1 : monsterList) {
            System.out.println("CHOICE: "+ monsterChoice+ " " + monster1);
            monsterChoice++;
        }
        System.out.print("Decide what monster you want to hit: ");
        int monsterIndex = Input.intInput() -1;
        // build a miss system? Even for monsters based on something.

        monsterList.get(monsterIndex).setHp(monsterList.get(monsterIndex).getHp() - currentPlayer.getDamage());
        System.out.printf("The rogue attacks with a swift slash, Dealing %s to monster %s", currentPlayer.getDamage(), monsterList.get(monsterIndex).getMonsterName());
    }

    @Override
    public void flee() {

    }

    @Override
    public void getStatus() {
        // should remove this one
    }

    @Override
    public String toString() {
        return
                Color.GREEN + className + Color.RESET + ":" +
                        "     Hp = " + hp + "  || " +
                        " Damage = " + damage + "  || " +
                        " Resource = " + resource + "  || " +
                        " Strength = " + strength + "  || " +
                        " Agility = " + agility + "  || " +
                        " Intellect = " + intellect + "  || " +
                        " Initiative = " + initiative + "  ||";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getResource() {
        return resource;
    }

    @Override
    public void setResource(int resource) {
        this.resource = resource;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public int getIntellect() {
        return intellect;
    }

    @Override
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public int getdefence() {
        return defence;
    }

    public void setdefence(int defence) {
        this.defence = defence;
    }

    @Override
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
