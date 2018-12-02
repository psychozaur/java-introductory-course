package com.podstaw.od.java.rybicki.marcin.enum_example;

public enum AcademicClasses {
    ALGEBRA(30),
    PHYSICS(60),
    INTRODUCTION_TO_CHEMISTRY(60),
    QUANTUM_CHEMISTRY(60),
    ORGANIC_CHEMISTRY(120);

    private int numberOfHours;

    AcademicClasses(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }
}
