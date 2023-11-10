package com.alexanderhasslund.demo.main.Classes;
import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;

public class Sorcerer extends Player implements IClasses, ICombat {

    private String className;
    private int id;
    private int maxHp;
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

    public Sorcerer() {
        this.className = Color.BLUE + "SORCERER" + Color.RESET;
        this.maxHp = 90;
        this.hp = 90;
        this.id = 0;
        this.damage = 10; //find a good formula;
        this.resource = 150;
        this.strength = 3;
        this.agility = 5;
        this.intellect = 22;
        this.level = 1;
        this.initiative = 70;
        this.defence = 5;
        this.isDead = false;
        this.hasPlayed = false;
    }

    @Override
    public void setLevelUp(Player currentPlayer) {

        int PlayerCurrentExperienceExperince = currentPlayer.getExperience();
        currentPlayer.setExperience(0);

        for (int i = PlayerCurrentExperienceExperince; i > 0; i--) {
            currentPlayer.setExperience(currentPlayer.getExperience()+1);

            if (currentPlayer.getExperience() == 100) { // fix better logic for leveling...
                currentPlayer.setLevel(currentPlayer.getLevel() +1);
                System.out.printf("%s %s just leveled up to level %s! ", currentPlayer.getClassName(), currentPlayer.getName(), currentPlayer.getLevel());
                currentPlayer.setExperience(0);
                addStatsToPlayer(currentPlayer);
            }
        }
    }

    @Override
    public void addStatsToPlayer(Player currentPlayer) {

        currentPlayer.setStrength(currentPlayer.getStrength() + (int)(currentPlayer.getLevel() / 2.3));
        currentPlayer.setAgility(currentPlayer.getAgility() + (int)(currentPlayer.getLevel() / 1.2));
        currentPlayer.setIntellect(currentPlayer.getIntellect() + (int)(currentPlayer.getLevel() / 0.8));

        currentPlayer.setDamage(currentPlayer.getDamage() + (currentPlayer.getIntellect() / 5));
        currentPlayer.setResource(currentPlayer.getResource() + (currentPlayer.getIntellect() / 2));
        currentPlayer.setDefence(currentPlayer.getDefence() + (int) (currentPlayer.getIntellect() * 0.2));
        currentPlayer.setMaxHp(currentPlayer.getMaxHp()+ (int) (currentPlayer.getStrength() * 0.1));
    }



    @Override
    public void trait(List<Player> playerList, Player currentPlayer, List<Monster> monsterList) {

        System.out.println("The sorcerer muster all its power and blast all monster in range: ");

        for (Monster monster : monsterList) {
             monster.setHp(monster.getHp() - (int) (currentPlayer.getDamage() * (level * 1.3)));
        }
        System.out.println("Doing per monster: " + ((int) (currentPlayer.getDamage() * (level * 1.3))));
        System.out.println("And in total: " + ((int) (currentPlayer.getDamage() * (level * 1.3)*monsterList.size())));

        currentPlayer.setResource(currentPlayer.getResource() - 100);
        //Dragons breath
        //Based on how many targets it will cleave
        //Find a good way to work this out, but first we need to add all monsters and then split
        //damage * some trait / array.size() == all monster in Array

        //Cooldown
    }

    @Override
    public void spells(List<Player> playerList, Player player, List<Monster> monsterList) {
        switch (1){
            case 1 -> {
                System.out.println("builds up damage over time, over three rounds: ");
            }
            case 2 -> {
                System.out.println("The sorcerer cocoons it self, soaks all incoming harm");
            }
            default -> {System.out.println("Use right input");}
        }
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

        monsterList.get(monsterIndex).setHp(monsterList.get(monsterIndex).getHp() -
        (currentPlayer.getDamage() + currentPlayer.getInventoryList().get(0).getDamage() + currentPlayer.getInventoryList().get(1).getDamage())
        + (currentPlayer.getIntellect() / 7));

        System.out.printf("The Sorcerer attacks with all element aligned, Dealing %s to monster %s", currentPlayer.getDamage(), monsterList.get(monsterIndex).getMonsterName());
    }


    @Override
    public void getStatus() {

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
    public int getDefence() {
        return defence;
    }

    @Override
    public void setDefence(int defence) {
        this.defence = defence;
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

    @Override
    public int getInitiative() {
        return initiative;
    }

    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean dead) {
        isDead = dead;
    }


    @Override
    public String toString() {
        return
                Color.BLUE+ className + Color.RESET + ":" +
                "  Hp = " + hp + "   || " +
                " Damage = " + damage + "  || " +
                " Resource = " + resource + "  || " +
                " Strength = " + strength + "  || " +
                " Agility = " + agility + "  || " +
                " Intellect = " + intellect + "  || " +
                " Initiative = " + initiative + "  ||";
    }

}
