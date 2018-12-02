package com.podstaw.od.java.rybicki.marcin.data_type;

public class DataTypes {

    public static void main(String[] args) {

        int bb = 100;

        byte d = 5 + 6;
        Byte dByte = 0;

        System.out.println("d: " + d);

        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Min byte: " + Byte.MIN_VALUE);


        System.out.println("///////////////////////////");

        short c = 0; // 5 + 8? 2 bajty
        Short cShort = 0;

        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Min short: " + Short.MIN_VALUE);


        int a = 5 + 8; // 4 bajty
        Integer aInteger = 5 + 8; // new Integer(5 + 8);


       // System.out.println(a);
       // System.out.println(aInteger);

        System.out.println("////////////////////////////////");

        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min int: " + Integer.MIN_VALUE);

        long b = 5 + 8; // 8 bajtów
        Long bLong = 5L + 8L; // new Long(5 + 8);

        System.out.println("/////////////////////////////////");

        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Min long: " + Long.MIN_VALUE);


        System.out.println("/////////////////////////////////");

        float e = 3.11f; // 4 bajty
        Float eFloat = 3.11f;

        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Min float: " + Float.MIN_VALUE);

        System.out.println("/////////////////////////////////////");

        double f = 3.11; // 8 bajtów
        Double fDouble = 3.11;

        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Min double: " + Double.MIN_VALUE);

        System.out.println("//////////////////////////////////////");

        boolean trueOrFalse = false;
        trueOrFalse = true;

        Boolean bBoolean = true;
        bBoolean = false;
        bBoolean = null;

        System.out.println("/////////////////////////////////////");

        char littleChar = ' '; // 2 bajty (bez znaku)
        Character lCharacter = 'd';

        System.out.println("Max char: " + Character.MAX_VALUE);
        System.out.println("Min char: " + Character.MIN_VALUE);

        System.out.println("////////////////////////////////////////");

        System.out.println("Max char: " + (int)Character.MAX_VALUE);
        System.out.println("Min char: " + (int)Character.MIN_VALUE);




    }
}
