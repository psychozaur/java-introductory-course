package com.podstaw.od.java.rybicki.marcin.watering_plants;

import com.podstaw.od.java.rybicki.marcin.enum_example.DaysOfWeek;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Plant> makePlants() {
        List<Plant> plants = new ArrayList<>();

        plants.add(new Rose(10,15, 5));
        plants.add(new Rose(9,15, 5));
        plants.add(new Tulip(11,10, 10));
        plants.add(new Tulip(11,10, 10));
        plants.add(new Pine(90,150, 100));
        plants.add(new Pine(95,140, 110));

//        plants.set(1,new Rose(5,5,5));
//        plants.remove(2);

        return plants;
    }

    public static void main(String[] args) {
        Gardener rysiek = new EducatedGardener();

        List<Plant> plants = makePlants();

        for (DaysOfWeek day : DaysOfWeek.values()){

            System.out.println("/////////////////////////////");
            System.out.println(day.name());
            System.out.println("/////////////////////////////");

            for (Plant plant : plants){
                rysiek.waterPlant(plant);
                rysiek.makePlantGrow(plant);

                System.out.println(plant);
            }

        }

    }

}
