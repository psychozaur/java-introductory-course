package com.podstaw.od.java.rybicki.marcin.enum_example;

public class Main {

    public static void main(String[] args) {
        Seasons whichOne;
        whichOne = Seasons.SUMMER;

        DaysOfWeek today;
        today = DaysOfWeek.SATURDAY;

        System.out.println(today.ordinal());
    }
}
