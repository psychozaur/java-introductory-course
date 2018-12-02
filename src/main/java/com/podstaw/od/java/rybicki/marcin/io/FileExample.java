package com.podstaw.od.java.rybicki.marcin.io;

import java.io.*;

public class FileExample {

    public static void main(String[] args) {

        File maybeFile = new File("/home/marcin/Documents/version-control/reflections/recipes/cake-recipe.txt");
        File maybeFile2 = new File("/home/marcin/Desktop/todo");

        System.out.println("file exists: " + maybeFile.exists());
        System.out.println("file 2 exists: " + maybeFile2.exists());

        System.out.println("is file: " + maybeFile.isFile());
        System.out.println("is file 2: " + maybeFile2.isFile());

        File existingOneOrNot = new File("\\dsfsdfs\\dsfsfs");
        System.out.println(existingOneOrNot);

        try {
//            Reader reader = new FileReader(maybeFile);
            Reader reader2 = new FileReader(maybeFile2);
            int readChar;
            while ((readChar = reader2.read()) != -1){
                System.out.println("readChar: " + readChar);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
