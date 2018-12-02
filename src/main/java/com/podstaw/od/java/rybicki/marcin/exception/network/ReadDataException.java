package com.podstaw.od.java.rybicki.marcin.exception.network;

public class ReadDataException extends RuntimeException {

    ReadDataException(){

    }

    ReadDataException(String message){
        super(message);
    }

    ReadDataException(String message, Throwable cause){
        super(message,cause);
    }
}
