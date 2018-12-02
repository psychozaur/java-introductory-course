package com.podstaw.od.java.rybicki.marcin.string_tests;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Marcin");

        String ala = "ala " + "ma " + "kota";

        StringBuilder ala2 = new StringBuilder();
//        ala2.append("Ala");
//        ala2.append(" ma");
//        ala2.append(" kota.");

        ala2.append("Ala")
        .append(" ma")
        .append(" kota.");

        String ala2string = ala2.toString();

        System.out.println(ala);
        System.out.println(ala2);
        System.out.println(ala2string);

        ala2.replace(4,6,"miała");
        System.out.println(ala2);

        System.out.println(ala.substring(1,1));

    }

}
