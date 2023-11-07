package com.alexanderhasslund.demo.main.File;

import com.alexanderhasslund.demo.main.Player.Player;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class SaveFile {

    private List<Player> playerList;

    public SaveFile(List<Player> playerList) {
        this.playerList = playerList;
    }





        public void saveFilePlayer() throws IOException {

            String osName = System.getProperty("os.name").toLowerCase();
            String firstNameInOS = osName.substring(0, osName.indexOf(' '));
            switch(firstNameInOS) {
                case "linux" -> System.out.println("running on Linux");
                case "mac os x" -> System.out.println("running on macOS");
                case "windows" -> System.out.println("running on PC");
            }

            String concat = "";
            for (Player player : playerList) concat = player.getName() + " " + concat;

            File thisFile = new File("src\\com\\alexanderhasslund\\demo\\main\\File\\StoredFiles/save file " + concat + LocalDate.now() +".txt");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(thisFile));
            out.writeObject(playerList);
        }
}
