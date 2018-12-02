package com.podstaw.od.java.rybicki.marcin.exception;

public class TestThrowLevel2 {

    public static void main(String[] args) {

        ThrowLevel2 l2 = new ThrowLevel2();
        try {
            l2.doIt();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
