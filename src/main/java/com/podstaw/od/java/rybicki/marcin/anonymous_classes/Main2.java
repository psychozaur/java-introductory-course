package com.podstaw.od.java.rybicki.marcin.anonymous_classes;

public class Main2 {

    public static void main(String[] args) {

        Superman superman = new Superman();
        MoveableProcessor mp = new MoveableProcessor();
        mp.processMoveable(superman);

       Moveable batman =  new Moveable(){
            @Override
            public void run() {
                System.out.println("Not so fast");
            }

            @Override
            public void fly() {
                System.out.println("Only sometimes");
            }
        };

       mp.processMoveable(batman);

       mp.processMoveable(new Moveable() {
           @Override
           public void run() {
               System.out.println("Fast");
           }

           @Override
           public void fly() {
               System.out.println("Not able");
           }
       });
    }
}
