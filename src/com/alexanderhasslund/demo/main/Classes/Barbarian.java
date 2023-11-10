package com.alexanderhasslund.demo.main.Classes;
import com.alexanderhasslund.demo.main.Combat.ICombat;
import com.alexanderhasslund.demo.main.Engine.Color;
import com.alexanderhasslund.demo.main.Engine.Input;
import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.List;


public class Barbarian extends Player implements IClasses, ICombat {

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


    public Barbarian() {
        //Player barbarian = new Player(getName(),getTalentTreeList(),getInventoryList(),0,0,"BARBARIAN",115,20,100,22,8,0,0,10,55);
        //return barbarian;
        this.className = Color.RED + "BARBARIAN" + Color.RESET;
        this.maxHp = 115;
        this.hp = 115;
        this.id = 0;
        this.damage = 20;
        this.resource = 100;
        this.strength = 22;
        this.agility = 8;
        this.intellect = 0;
        this.level = 1;
        this.defence = 15;
        this.initiative = 55;
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

    public void addStatsToPlayer(Player currentPlayer) {

        //include a reset here if player levels up - otherwise stats gets calculated based on currentvalue...

        currentPlayer.setStrength(currentPlayer.getStrength() + (int)(currentPlayer.getLevel() / 1.1));
        currentPlayer.setAgility(currentPlayer.getAgility() + (int)(currentPlayer.getLevel() / 0.9));
        currentPlayer.setIntellect(currentPlayer.getIntellect() + (int)(currentPlayer.getLevel() / 2.2));

        currentPlayer.setDamage(currentPlayer.getDamage() + (int)(currentPlayer.getStrength() / 3));
        currentPlayer.setDefence(currentPlayer.getDefence() + (int) (currentPlayer.getStrength() * 0.2));
        currentPlayer.setMaxHp(currentPlayer.getMaxHp() + (int) (currentPlayer.getStrength() * 0.1));

    }



    @Override
    public void trait(List<Player> playerList, Player currentPlayer, List<Monster> monsterList) {
        int monsterChoice = 1;

        for (Monster monster1 : monsterList) {
            System.out.println("CHOICE: "+ monsterChoice+ " " + monster1);
            monsterChoice++;
        }
        System.out.print("Decide what monster you want to hit: ");
        int monsterIndex = Input.intInput() -1;

        int calcBarbarianUltimate = ((monsterList.get(monsterIndex).getHp() * 100) / currentPlayer.getHp());

        if (currentPlayer.getResource() >= 50) {
            if (calcBarbarianUltimate <= 20) {
                System.out.printf("The barbarian executes %s, to even out the odds \n", monsterList.get(monsterIndex).getMonsterName());
                monsterList.get(monsterIndex).setHp(0);
            } else {
                System.out.printf("The barbarian tried to execute %s, but failed\n", monsterList.get(monsterIndex).getMonsterName());
            }
            currentPlayer.setResource(currentPlayer.getResource() - 50);
        } else {
            System.out.printf("%s doesnt have enough rage to execute the target...", currentPlayer.getClassName());
        }

    }


    @Override
    public void spells(List<Player> playerList, Player currentPlayer, List<Monster> monsterList) {

        switch (1) {
            case 1 -> { // a baseline damage spell that adds 3 damage and uses 'resources'

                System.out.printf("%s crys a war cry, increasing the parties strength by 10", currentPlayer.getClassName(), 10);
                for (Player player : playerList) {
                    player.setStrength(player.getStrength() + 10);
                }
                currentPlayer.setResource(currentPlayer.getResource() - 10);

            }
            case 2 -> { //
                System.out.println( "The barbarian muster its rage, gaining defence euqal to: " + (defence + 2));
                currentPlayer.setDefence(currentPlayer.getDefence() + 10);
                currentPlayer.setResource(currentPlayer.getResource() - 10);
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
        (currentPlayer.getDamage() + currentPlayer.getInventoryList().get(0).getDamage()
        + currentPlayer.getInventoryList().get(1).getDamage()) + (currentPlayer.getStrength() /7));

        System.out.printf("The barbarian attacks with a hard hitting strike, Dealing %s to monster %s \n", currentPlayer.getDamage(), monsterList.get(monsterIndex).getMonsterName());
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
                        " Initiative = " + initiative + "  ||";
    }


    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
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

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public void setDefence(int defence) {
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


