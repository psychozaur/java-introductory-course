package com.podstaw.od.java.rybicki.marcin.exception;

public class MyException extends Exception {

    public MyException(){

    }

    public MyException(String message){
        super(message);
    }

    public MyException(String message, Throwable cause){
        super(message, cause);
    }
}
