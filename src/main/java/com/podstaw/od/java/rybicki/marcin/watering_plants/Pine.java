package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class Pine extends Plant {

    public Pine(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 20;

        currentWaterLevelInMl -= waterUseInMl;
    }

    @Override
    public String toString() {
        return "Pine{" +
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
