package com.podstaw.od.java.rybicki.marcin;

public class Car {


    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;

    //constructor
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public static void main(String[] args) {
        //folkswagyn to jest referencja
        Car folkswagyn = new Car("VW",
                            "Polo",
                            "biały",
                    2010);

        // szkoda to jest referencja
        Car szkoda = new Car("Skoda",
                                    "Fabia",
                                    "srebrny",
                                            2005);

        // autoMarcina jest referencją do obiektu wskazywanego przez referencję szkoda
        Car autoMarcina = szkoda; //:P

        System.out.println("Szkoda: " + szkoda.toString());
        System.out.println("Auto Marcina: " + autoMarcina.toString());

        autoMarcina.setColor("kolor gruzu");
        System.out.println("Auto Marcina: " + autoMarcina.toString());
        System.out.println("Szkoda: " + szkoda.toString());

        Car autoMarka = null;

        System.out.println("Auto Marka: " + autoMarka);

        System.out.println("Kolor auta Marcina: " + autoMarcina.getColor());



    }
}
