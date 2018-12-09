package com.podstaw.od.java.rybicki.marcin.null_avoid;

public class Sink {

    private String brand;

    public Sink(String brand) {
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateBrand(brand);
    }

    private String validateBrand(String brand){
        if (null == brand){
            throw new IllegalArgumentException("brand cannot be null");
        }

        return brand;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
