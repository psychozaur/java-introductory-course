package com.podstaw.od.java.rybicki.marcin.exception;

public class WrongParameterException extends Exception {

    public WrongParameterException(){

    }

    public WrongParameterException(String message){
        super(message);
    }

    public WrongParameterException(String message, Throwable cause){
        super(message,cause);
    }
}
