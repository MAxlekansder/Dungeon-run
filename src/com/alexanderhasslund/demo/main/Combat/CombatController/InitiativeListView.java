package com.alexanderhasslund.demo.main.Combat.CombatController;

import com.alexanderhasslund.demo.main.Monster.Monster;
import com.alexanderhasslund.demo.main.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class InitiativeListView {

    List<InitiativeListView> initiativeList = new ArrayList<>();
    private String combatName;
    private int initiative;
    private int hp;
    private int resource;
    private int id;
    private int defence;

    }

    public void presentInitiative(List<Player> playerList, List<Monster> monsterList) {

        for (int i = 0; i < playerList.size();i++) {

        }

    }




    /*
        for (Object object : tempList) {
            if(object instanceof Player) {
                System.out.println(
                        ((Player) object).getClassName()
                                + " || Player = " +((Player) object).getName()
                                + " || HP = " + ((Player) object).getHp()
                                + " || Resource = " + ((Player) object).getResource()
                                + " || Damage = " + ((Player) object).getDamage()
                                + " || Defence = " + ((Player) object).getDefence()
                                + " || Initiative = " + ((Player) object).getInitiative());
            }
             else if (object instanceof Monster) {
                System.out.println(
                        Color.CYAN +"MONSTER" + Color.RESET
                        + " // Type = " + ((Monster)object).getMonsterName()
                        + " // ID = " + ((Monster)object).getMonsterId() +1
                        + " // HP = " + ((Monster)object).getHp()
                        + " // Damage = " + ((Monster)object).getDamage()
                        + " // Defence = "  + ((Monster)object).getDefence()
                        + " // Initiative = "  + ((Monster)object).getInitiative());
            }
        }

        // fix vewing here and sort it so we see how everyone plays, thats the whole point of combat...
        System.out.println("INITIATIVE TRACKER: Ascending order -----------------------------------\n");
       /* for( Player player : playerList) {
            System.out.println(
                    player.getClassName()
                    + " || Player = " +player.getName()
                    + " || HP = " + player.getHp()
                    + " || Resource = " + player.getResource()
                    + " || Damage = " + player.getDamage()
                    + " || Defence = " + player.getDefence()
                    + " || Initiative = " + player.getInitiative());
        }

        for (Monster monster : monsterList) {
            System.out.println(
            Color.CYAN +"MONSTER" + Color.RESET
                    + " // Type = "+ monster.getMonsterName()
                    + " // HP = " + monster.getHp()
                    + " // ID = " + (monster.getMonsterId() +1)
                    + " // Damage = " + monster.getDamage()
                    + " // Defence = "  + monster.getDefence()
                    + " // Initiative = "  + monster.getInitiative());
        }
        System.out.println("\nINITIATIVE TRACKER: Ascending order -------

     */


    public List<InitiativeListView> getInitiativeList() {
        return initiativeList;
    }

    public void setInitiativeList(List<InitiativeListView> initiativeList) {
        this.initiativeList = initiativeList;
    }

    public String getCombatName() {
        return combatName;
    }

    public void setCombatName(String combatName) {
        this.combatName = combatName;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}

