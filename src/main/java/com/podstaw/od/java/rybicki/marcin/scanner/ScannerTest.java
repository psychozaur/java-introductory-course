package com.podstaw.od.java.rybicki.marcin.scanner;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please type in three numbers: ");
        int intValue = inputReader.nextInt();
        int secondValue = inputReader.nextInt();
        int thirdValue = inputReader.nextInt();

        System.out.println("I've got them divided: " + intValue / secondValue / thirdValue);

        if (inputReader.hasNextInt()){

        }

        for (; inputReader.hasNext();){
            if (inputReader.hasNextInt()){
                System.out.println(inputReader.next());
            } else{
                inputReader.next();
            }
        }
    }



}
