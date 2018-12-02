package com.podstaw.od.java.rybicki.marcin.exception.network;

public class Main {

    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        //może być również try-finally albo sam try
        String readData = null;
        try {
            readData = stockExchange.readData();
            System.out.println("after");
        } catch (ReadDataException e){
            readData = "";
        } finally {
            System.out.println("here");
        }

        for (int i = 0; i < 5; i++){
            System.out.println(readData);
        }

    }
}
