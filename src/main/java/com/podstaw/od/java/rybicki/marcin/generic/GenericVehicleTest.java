package com.podstaw.od.java.rybicki.marcin.generic;

import com.podstaw.od.java.rybicki.marcin.interface_example.Car;
import com.podstaw.od.java.rybicki.marcin.interface_example.Plane;
import com.podstaw.od.java.rybicki.marcin.interface_example.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {

    //method takes List of Vehicle
    //display Cars/Planes
    //method for adding Cars to List

    public static void displayVehicleList (List<? extends Vehicle> list){
        System.out.println("/////////////////////////////////");
        for (Vehicle v : list){
            System.out.println(v);
        }
    }

    public static void addCarsToList (List<? super Car> list){
        list.add(new Car());
    }

    public static void main(String[] args) {
        List<Plane> planesList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 2; i++){
            planesList.add(new Plane());
        }

        for (int i = 0; i < 2; i++){
            carList.add(new Car());
        }

        displayVehicleList(planesList);
        displayVehicleList(carList);

        addCarsToList(carList);

        displayVehicleList(planesList);
        displayVehicleList(carList);
    }
}
