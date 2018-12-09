package com.podstaw.od.java.rybicki.marcin.null_avoid.football;


import java.util.Optional;

//FootballClub -> Stadium -> Chair -> Number
//no footballclub without stadium
//stadium can be without chairs
//chair can be without number
public class Main {

    public static void main(String[] args) {
        FootballClub fc1 = new FootballClub(new Stadium(new Chair(new Number(78))));
        FootballClub fc2 = new FootballClub(new Stadium(new Chair(null)));
        FootballClub fc3 = new FootballClub(new Stadium(new Chair(new Number(98))));
        FootballClub fc4 = new FootballClub(new Stadium(null));

        displayNumber1(fc1);
        displayNumber1(fc2);
        displayNumber1(fc3);
        displayNumber1(fc4);

        displayNumber2(fc1);
        displayNumber2(fc2);
        displayNumber2(fc3);
        displayNumber2(fc4);
    }

    private static void displayNumber1 (FootballClub fc){
        Optional.ofNullable(fc)
                .map(fc1 -> fc1.getStadium())
                .map(stadium -> stadium.getChair())
                .map(chair -> chair.getNumber())
                .map(number -> number.getNumber())
                .ifPresent(s -> System.out.println("No of chair: " + s));
    }

    private static void displayNumber2 (FootballClub fc){
        Optional.ofNullable(fc)
                .map(fc1 -> fc1.getStadium())
                .flatMap(stadium -> stadium.getChairOptional())
                .flatMap(chair -> chair.getNumberOptional())
                .flatMap(number -> number.getNumberOptional())
                .ifPresent(s -> System.out.println("No of chair: " + s));
    }
}
