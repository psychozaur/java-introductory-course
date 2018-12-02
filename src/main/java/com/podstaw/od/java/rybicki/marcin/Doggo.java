package com.podstaw.od.java.rybicki.marcin;

public class Doggo {

    private String name;
    private int numberOfPaws;
    private double age;
    private boolean hasTail;
    private String race;

    public Doggo(String name, int numberOfPaws, double age, boolean hasTail, String race) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
        this.age = age;
        this.hasTail = hasTail;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Doggo{" +
                "name='" + name + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", age=" + age +
                ", hasTail=" + hasTail +
                ", race='" + race + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Doggo doggo1 = new Doggo("Fart",4,2.5,true,"mutt");
    }
}
