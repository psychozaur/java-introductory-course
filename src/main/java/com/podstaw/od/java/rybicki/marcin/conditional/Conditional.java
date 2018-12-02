package com.podstaw.od.java.rybicki.marcin.conditional;

public class Conditional {

    public static void main(String[] args) { // ... zamiast [] o_O
        int age = 17;
        testAge(age);

        String string = "ala";
        printStringLength(string);
        printStringLength("ala ma kota");
        String string2 = null;
        // String test = ""; // jako zabezpieczenie przed null

        printStringLength(string2);
        testStringLength(string2);
/*
        if (age >= 0 && age <= 10) {
            System.out.println("idź do szkoły");
        }

        else if (age > 10 && age <= 15) {
            System.out.println("za młody jesteś");
        }

        else if (age > 15 && age <= 18) {
            System.out.println("do matury byś się uczył");
        }

        else if (age > 18) {
            System.out.println("jesteś pełnoletni, wyprowadzaj się");
        }

        else {
            System.out.println("no chyba masz nieujemny wiek");
        }
*/
    }

    public static void testAge(int age) {
        if (age < 0) {
            System.out.println("Not born!");
        } else if (age <= 10) {
            System.out.println("Too young!");
        } else if (age <= 15) {
            System.out.println("almost...");
        } else if (age <= 18) {
            System.out.println("almost, almost...");
        } else {
            System.out.println("OK!");
        }

        // &&, ||, ! - short-circuit
        //  np. a && b
        // jeśli a jest fałszem, to już nie ma sensu sprawdzać b
        // a || b
        // jeśli a jest prawdą, podobnie omijamy b
        // &, |, ~ - operatory bitowe (nie ulegają skracaniu)
        // ~ - true tylko wtedy, gdy mamy różne wartości

    }

    public static void printStringLength(String string) {
        if (string != null) {
            int stringLen = string.length();
            System.out.println("string length: " + stringLen);
        } else {
            System.out.println("null is not allowed here!");
        }


    }

    public static void testStringLength(String string) {
        if (string != null && string.length() < 10) { // uwaga na operator &, bo wtedy wykona length() na nullu
            System.out.println("Quite a short string");
        } else {
            System.out.println("null is not allowed here!");
        }
    }
}
