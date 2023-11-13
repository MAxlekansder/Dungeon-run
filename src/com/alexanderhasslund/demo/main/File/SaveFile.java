package com.alexanderhasslund.demo.main.File;

import com.alexanderhasslund.demo.main.Player.Player;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SaveFile {


        public void saveFilePlayer(List<Player> playerList) {

            String osName = System.getProperty("os.name").toLowerCase();
            String firstNameInOS = osName.substring(0, osName.indexOf(' '));
            switch (firstNameInOS) {
                case "linux" -> System.out.println("running on Linux");
                case "mac os x" -> System.out.println("running on macOS");
                case "windows" -> System.out.println("running on PC");
            }

            String concat = "";
            for (Player player : playerList) concat = player.getName() + " " + concat;

            try {
                /*
               PrintWriter pw = new PrintWriter( new FileOutputStream("players " + LocalDate.now()));
               for (Player player : playerList) {
                 pw.println(
                         "Name: " + player.getName()
                         + " Class name: " + player.getClassName()
                         + " Id " + player.getId()
                         + " Level " + player.getLevel()
                         + " Experience " + player.getExperience()
                         + " Currency " + player.getCurrency()
                         + " Initiative " + player.getInitiative()

                         + " HP " + player.getMaxHp()
                         + " Resource " + player.getMaxResource()
                         + " BaseDamage " + player.getBaseDamage()
                         + " BaseStrength " + player.getBaseStrength()
                         + " BaseAgility " + player.getBaseAgility()
                         + " BaseIntellect " + player.getBaseIntellect()
                 );
               }
               pw.close(); */

                FileOutputStream fos = new FileOutputStream("player");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (Player player : playerList)
                    oos.writeObject(player);
                System.out.println("Save successfull");
            } catch (Exception e) {
                System.out.println("Couldn't save file");
            }
        }

        public void loadFilePlayer() {
            List<Player> playerList = new ArrayList<>();

            try {
                FileInputStream fin = new FileInputStream("player");
                ObjectInputStream objIn = new ObjectInputStream(fin);
                playerList = (List<Player>)objIn.readObject();
            } catch (Exception e) {
                System.out.println("File not loaded correctly");
            }
        }

}
