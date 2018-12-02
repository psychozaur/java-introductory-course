package com.podstaw.od.java.rybicki.marcin.exception;

public class TestMyRuntimeException {

    public static void level3() { //throws MyRuntimeException{
        throw new MyRuntimeException("Problem at level 3");
    }

    //nie musi sygnalizować, że throws, ponieważ to RuntimeException
    public static void level2(){
        level3();
    }

    public static void level1() { // throws MyRuntimeException{
        level2();
    }

    public static void main(String[] args) {
//        try {
//            throw new MyRuntimeException("nerd");
//        } catch (MyRuntimeException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("My runtime exception caught!");

        //3 levels
        //at level 3 - throw MyRuntimeException
        //catch in main()
        try{
            level1();
        } catch (MyRuntimeException e){
            e.printStackTrace();
        }


    }
}
