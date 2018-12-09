package com.podstaw.od.java.rybicki.marcin.stream;

public class Country {

    private long numberOfPeople;
    private String name;
    private double area;
    private double averagePaycheck;

    public Country(long numberOfPeople, String name, double area, double averagePaycheck) {
        this.numberOfPeople = numberOfPeople;
        this.name = name;
        this.area = area;
        this.averagePaycheck = averagePaycheck;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAveragePaycheck() {
        return averagePaycheck;
    }

    public void setAveragePaycheck(double averagePaycheck) {
        this.averagePaycheck = averagePaycheck;
    }

    @Override
    public String toString() {
        return "Country{" +
                "numberOfPeople=" + numberOfPeople +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", averagePaycheck=" + averagePaycheck +
                '}';
    }
}
