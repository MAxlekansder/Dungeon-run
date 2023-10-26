package com.alexanderhasslund.demo.main.Engine;

public class StringManipulator {

    public String manipulateString(String string) throws InterruptedException {
        for (char c : string.toCharArray()) {
            System.out.print(c);
            Thread.sleep(60);
        }
        return string;
    }

    public String manipulateStringFormat(String string) throws InterruptedException {
        for (char c : string.toCharArray()) {
            System.out.print(c);
            Thread.sleep(60);
        }
        return string;
    }


    // try to print a YOU DIED - dark souls grej...
}
