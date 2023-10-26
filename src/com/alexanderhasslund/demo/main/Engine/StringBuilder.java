package com.alexanderhasslund.demo.main.Engine;

public class StringBuilder {

    private void manipulateString(String string) throws InterruptedException {
        for (char c : string.toCharArray()) {
            System.out.println(c);
            Thread.sleep(20);
        }
    }
    // try to print a YOU DIED - dark souls grej...
}
