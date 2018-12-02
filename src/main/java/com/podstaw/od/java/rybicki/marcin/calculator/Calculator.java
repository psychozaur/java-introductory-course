package com.podstaw.od.java.rybicki.marcin.calculator;

import java.util.Scanner;

public class Calculator {

    //mnożenie, dzielenie, dodawanie, odejmowanie
    //modulo? pierwiastki? potęgi?
    //w swingu?

    public static double multiplyTwoNumbers (double number1, double number2){
        return number1 * number2;
    }

    public static double divideTwoNumbers (double number1, double number2){
        if (number2 != 0) {
            return number1 / number2;
        }
        else {
            System.out.println("Never divide by 0!");
            return number1;
        }
    }

    public static double addTwoNumbers (double number1, double number2){
        return number1 + number2;
    }

    public static double subtractTwoNumbers (double number1, double number2){
        return number1 - number2;
    }

    public static void main(String[] args) {

        for (;;) {

            Scanner inputReader = new Scanner(System.in);

            System.out.println(":::::::Calculator::::::::");
            System.out.println("Enter an appropriate number to choose a mathematical operation: ");
            System.out.println("'1' - addition, '2' - subtraction, '3' - multiplication or '4' - division.");
            System.out.println("Enter '0' to end program.");

            int selection = inputReader.nextInt();

            if (selection == 1){
                System.out.println(":::::::Addition::::::::");
                double firstValue = inputReader.nextDouble();
                double secondValue = inputReader.nextDouble();
                System.out.println(addTwoNumbers(firstValue,secondValue));
            }

            if (selection == 2){
                System.out.println(":::::::Subtraction::::::::");
                double firstValue = inputReader.nextDouble();
                double secondValue = inputReader.nextDouble();
                System.out.println(subtractTwoNumbers(firstValue,secondValue));
            }

            if (selection == 3){
                System.out.println(":::::::Multiplication::::::::");
                double firstValue = inputReader.nextDouble();
                double secondValue = inputReader.nextDouble();
                System.out.println(multiplyTwoNumbers(firstValue,secondValue));
            }

            if (selection == 4){
                System.out.println(":::::::Division::::::::");
                double firstValue = inputReader.nextDouble();
                double secondValue = inputReader.nextDouble();
                System.out.println(divideTwoNumbers(firstValue,secondValue));
            }

            if (selection == 0){
                System.out.println("Goodbye and have a nice day!");
                break;
            }
        }

    }
}
