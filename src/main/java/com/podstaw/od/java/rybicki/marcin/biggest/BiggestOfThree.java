package com.podstaw.od.java.rybicki.marcin.biggest;

import java.util.Scanner;

public class BiggestOfThree {

    public static int biggestOfThree(int d, int e, int f){
        int biggest = d;

        biggest = (d > e) ? d : e;
        biggest = (biggest > f) ? biggest : f;

        return biggest;
    }

    public static int lowestOfFour(int d, int e, int f, int g){
        int lowest = d;

        lowest = (lowest < e) ? lowest : e;
        lowest = (lowest < f) ? lowest : f;
        lowest = (lowest < g) ? lowest : g;

        return lowest;
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

//        System.out.println("Please type in three numbers:");
//        int first = inputReader.nextInt();
//        int second = inputReader.nextInt();
//        int third = inputReader.nextInt();
//
//        System.out.println("Biggest of three: " + biggestOfThree(first,second,third));

        System.out.println("Please type in four numbers:");
        int first = inputReader.nextInt();
        int second = inputReader.nextInt();
        int third = inputReader.nextInt();
        int fourth = inputReader.nextInt();

        System.out.println("Lowest of four: " + lowestOfFour(first,second,third,fourth));


    }
}
