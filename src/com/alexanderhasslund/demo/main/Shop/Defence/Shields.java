package com.alexanderhasslund.demo.main.Shop.Defence;

public class Shields extends Defence {

    private int defence;
    private int block;
    private int levelLock;

    public void standardShield() {
        this.defence = 5;
        this.block = 0;
        this.levelLock = 0;
    }

    public void bulkShield() {
        this.defence = 10;
        this.block = 0;
        this.levelLock = 2;
    }

    public void spikedShield() {
        this.defence = 15;
        this.block = 5;
        this.levelLock = 5;
    }

    public void divineShield() {
        this.defence = 40;
        this.block = 30;
        this.levelLock = 10;
    }
}
