package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class EducatedGardener extends Gardener {

    @Override
    public void waterPlant(Plant plant) {
        int waterUse = plant.getRequiredIncreaseWaterLevelInMl();
        plant.increaseWaterLevel(waterUse);
    }
}
