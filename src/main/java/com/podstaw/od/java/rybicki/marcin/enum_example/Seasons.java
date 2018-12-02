package com.podstaw.od.java.rybicki.marcin.enum_example;

public enum Seasons {
    WINTER(-10),
    SPRING(5),
    SUMMER(25),
    AUTUMN(7);

    private float averageTempInC;

    private Seasons(float averageTempInC){
        this.averageTempInC = averageTempInC;
    }

    public float getAverageTempInC() {
        return averageTempInC;
    }
}
