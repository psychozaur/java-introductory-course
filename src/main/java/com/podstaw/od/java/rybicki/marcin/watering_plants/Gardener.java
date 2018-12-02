package com.podstaw.od.java.rybicki.marcin.watering_plants;

public class Gardener {

    public void waterPlant(Plant plant){
        plant.increaseWaterLevel(2);
    }

    public void makePlantGrow(Plant plant) {
        plant.grow();
    }
}
