package com.podstaw.od.java.rybicki.marcin.generic;

import com.podstaw.od.java.rybicki.marcin.animal.Animal;
import com.podstaw.od.java.rybicki.marcin.animal.Cat;
import com.podstaw.od.java.rybicki.marcin.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionsTests {

    // method takes list of animals
    //display dogs and cats

    // lista czegokolwiek, co będzie rozszerzać, dziedziczyć po Animal (możemy przeglądać)
    // możemy przeglądać listę kotów, no problem
    public static void processAnimals(List<? extends Animal> animals){

        for (Animal a : animals){
            System.out.println(a);
        }
//        to można tylko przeglądać
//        animals.add(new Animal());
    }

    public static void processAnimals(Animal[] animals){

        for (Animal a : animals){
            System.out.println(a);
        }

//        animals[0] = new Cat();
    }

    // lista czegokolwiek, co może dziedziczyć po Dog (z Dogiem włącznie możemy dodawać)???
    // albo nie?
    // nie możemy dodawać kotów, zabronione
    public static void addDog(List<? super Dog> animals) {
        animals.add(new Dog());
    }

    public static void main(String[] args) {

        List<Animal> animals1 = new ArrayList<>();
        List<Animal> animals2 = new ArrayList<>();
        Animal[] animals3 = new Dog[2];
        Animal[] animals4 = new Animal[2];

        for (int i = 0; i < 2; i++){
            animals1.add(new Dog());
        }

        for (int i = 0; i < 2; i++){
            animals2.add(new Cat());
        }

        for (int i = 0; i < 2; i++){
            animals3[i] = new Dog();
        }

        for (int i = 0; i < 2; i++){
            animals4[i] = new Cat();
        }

        processAnimals(animals1);
        processAnimals(animals2);
        processAnimals(animals3);
        processAnimals(animals4);

        addDog(animals1);

    }
}
