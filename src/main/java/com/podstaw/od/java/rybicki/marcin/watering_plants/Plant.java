package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class Plant {

    protected int heightInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;

    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public void grow() {
        // empty
    }

    public int getRequiredIncreaseWaterLevelInMl(){
        return 150;
    }

    public void increaseWaterLevel (int waterInMl) {
        currentWaterLevelInMl += waterInMl;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
