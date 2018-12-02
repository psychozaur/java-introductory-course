package com.podstaw.od.java.rybicki.marcin.string_tests;

public class StringTest {

    public static void main(String[] args) {
        String name = "Marcin";

        //tworzy tylko nową referencję do już istniejącego literału w String Poolu
        String anotherMarcin = "Marcin";

        //nowa referencja
        String theSame = name;

        //tworzy zupełnie nowy obiekt w String Poolu
        String secondName = new String("Marcin");

        String surname = "Rybicki";

        System.out.println("My name: " + name);
        System.out.println("My surname: " + surname);
        System.out.println("Name, number of letters: " + name.length());
        System.out.println("Surname, number of letters: " + surname.length());
        System.out.println("////////////////////////////////////////////");
        System.out.println("Name, first letter: " + name.charAt(0));
        System.out.println("Surname, first letter: " + surname.charAt(0));
        System.out.println("///////////////////////////////////////////");
        System.out.println("Name, last letter: " + name.charAt(name.length() - 1));
        System.out.println("Surname, last letter: " + surname.charAt(surname.length() - 1));
        System.out.println("///////////////////////////////////////////////");
        System.out.println("My new surname: " + surname.substring(1,surname.length()));

        String newTheSame = theSame.replace('a','o');
        System.out.println("Replace: " + newTheSame);
        //System.out.println("Replace: " + theSame.replace('a', 'o'));
        System.out.println("My surname: ..." + surname);
        System.out.println("My surname: ..." + theSame);

        String hello = "hello";
        System.out.println(hello + " java");
        System.out.println(hello.concat(" java"));
        hello = hello + " java";
        System.out.println(hello);

        System.out.println("5 + 6: " + (5 + 6));
        System.out.println("5 + 6: " + 5 + 6);
        System.out.println(5 + 6 + " - 5 + 6");
        System.out.println((int)'J');
        System.out.println("J" + 7);




    }
}
