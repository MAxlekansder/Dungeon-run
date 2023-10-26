package com.alexanderhasslund.demo.main.Combat;

import com.alexanderhasslund.demo.main.Engine.Input;
import org.w3c.dom.ls.LSOutput;

public class Fight {

    Input input;

    public void fight() {
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
            }
            default -> {
                System.out.println("use the right input");
            }
        }
    }
}
