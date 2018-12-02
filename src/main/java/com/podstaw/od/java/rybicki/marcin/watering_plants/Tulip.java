package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class Tulip extends Plant {

    public Tulip(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 4;

        currentWaterLevelInMl -= waterUseInMl;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }

    @Override
    public int getRequiredIncreaseWaterLevelInMl() {
        return waterUseInMl;
    }
}
