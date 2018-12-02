package com.podstaw.od.java.rybicki.marcin.enum_example;

public enum Months {
    JANUARY(31),
    FEBRUARY(28){
        @Override
        public int getDays() {
            return super.getDays();
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int days;

    Months(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
