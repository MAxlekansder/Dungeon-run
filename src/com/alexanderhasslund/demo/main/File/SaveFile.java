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
            File thisFile = new File("text " + LocalDate.now() +".txt");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(thisFile));
            out.writeObject(playerList);
        }
}
