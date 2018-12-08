package com.podstaw.od.java.rybicki.marcin.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String houseName;
    private List<Apartment> apartments;

    public House(String houseName) {
        this.houseName = houseName;

        this.apartments = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            apartments.add(new Apartment(30));
        }
    }

    public House(){
        this.apartments = new ArrayList<>();
    }

    public void setHouseName(String houseName){
        this.houseName = houseName;
    }

    public void addApartment(Apartment apartment){
        this.apartments.add(apartment);
    }

    public class Apartment {
        int sizeInSquareM;
        String houseName;

        public Apartment(int sizeInSquareM) {
            this.sizeInSquareM = sizeInSquareM;
        }

        public void printNameOfHouse(){
            System.out.println("House name: " + House.this.houseName);
        }

        @Override
        public String toString() {
            return "Apartment{" +
                    "sizeInSquareM=" + sizeInSquareM +
                    '}';
        }
    }
}
