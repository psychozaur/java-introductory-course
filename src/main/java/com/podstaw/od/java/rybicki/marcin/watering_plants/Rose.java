package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class Rose extends Plant {

    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 5;

        currentWaterLevelInMl -= waterUseInMl;
    }

    @Override
    public String toString() {
        return "Rose{" +
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
