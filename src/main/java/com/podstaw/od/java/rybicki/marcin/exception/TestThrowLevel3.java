package com.podstaw.od.java.rybicki.marcin.exception;

public class TestThrowLevel3 {

    static int counter = 3;

    public static void main(String[] args) throws MyException {
        System.out.println("main()");
        level1();
        System.out.println("main() - before end");
    }

    public static int level1() throws MyException {
        System.out.println("level1()");
        try {
            level2();
        } catch (MyException e){
            e.printStackTrace();
        }

        return 1;
    }

    public static int level2() throws MyException {
        System.out.println("level2()");
        try {
            level3();
            System.out.println("level2() - after call to level3()");
            //polimorfizm - Exception wyłapie tu wszystko, ale pozbawi nas informacji o typie wyjątku
//        } catch (Exception e) {
//            e.printStackTrace();
        } catch (MyNewException e) {
            e.printStackTrace();
        } catch (MyException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("level2() - before return");
        return 2;
    }

    public static int level3() throws MyException, MyNewException {
        System.out.println("level3()");


        //zawsze poleci tylko pierwszy wyjątek (nawet bez ifów?)
            if (counter % 2 == 1){
                throw new MyException("Problem on level 3");
            }

            else if (counter == 4){
                throw new MyNewException("Problem on level 3");
            }

        System.out.println("level3() - before return");
            return 3;
    }
}
