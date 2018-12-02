package com.podstaw.od.java.rybicki.marcin.loop;

import java.util.Scanner;

public class WhileLoop {

    public static void printNumbers() {
        for (int i = 1; i <= 100_000; i++){
            if (i < 52){
                System.out.println("i: " + i);
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {

        char currentChar = 'r';

        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        System.out.println(input);
        currentChar = input.charAt(0);

        while (currentChar != 'r'){
            reader = new Scanner(System.in);
            input = reader.next();
            System.out.println(input);
            currentChar = input.charAt(0);
        }

        System.out.println("While loop ended");
        currentChar = 'r';

        for (;currentChar != 'r';){
            reader = new Scanner(System.in);
            input = reader.next();
            System.out.println(input);
            currentChar = input.charAt(0);
        }

        System.out.println("For loop ended");
        currentChar = 'r';

        do {
            reader = new Scanner(System.in);
            input = reader.next();
            System.out.println(input);
            currentChar = input.charAt(0);
        } while (currentChar != 'r');

        System.out.println("Do, while loop ended");
    }
}
