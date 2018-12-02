package com.podstaw.od.java.rybicki.marcin.loop;

public class ForLoop {

    public static void main(String[] args) {
//        printNTimes(1, "ala");
//        printNTimes(100, "ala ma kota");
//        printNTimes(1000000, "ala ma kota");
  //      printMyName5Times();
   //     infiniteLoop();
    }

    public static void printNTimes(int numberOfTimes, String valueToPrint){
        int i;
        for (i = 0; i < numberOfTimes; i++) {
            System.out.println(valueToPrint);
        }

        System.out.println(i);
    }

    public static void printMyName5Times (){
        for (int i = 0; i < 5; i++){
            System.out.println("Marcin");
        }
    }

    public static void infiniteLoop (){
        for (int i = 0;; i++) {
            System.out.println("awaria " + i);
        }
    }
}
