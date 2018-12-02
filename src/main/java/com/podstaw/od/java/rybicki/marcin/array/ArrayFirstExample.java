package com.podstaw.od.java.rybicki.marcin.array;

import com.podstaw.od.java.rybicki.marcin.animal.Animal;
import com.podstaw.od.java.rybicki.marcin.animal.Cat;
import com.podstaw.od.java.rybicki.marcin.animal.Dog;

public class ArrayFirstExample {

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[5];

        for (Object o : objects) {
            System.out.println(o);
        }

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static void processAnimalArray(Animal[] animals) {

        for (Animal animal : animals){
            animal.whichAnimal();
        }
    }

    public static void addCatToArray(Animal[] cats){
        if (cats instanceof Cat[]){
            cats[0] = new Cat();
        }
        else{
            System.out.println("Warning! Adding cat impossible.");
        }
    }

    public static Animal[] makeAnimals() {
        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++){
            if (i < 5){
                animals[i] = new Cat();
            }
            else {
                animals[i] = new Dog();
            }
        }

        return animals;
    }

    public static void readOutArray (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        int[] firstArray = new int[4];
        Animal[] animals = makeAnimals();

        // __Array__ zawiera length
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = i + 1;
        }

        readOutArray(firstArray);
        firstArray = new int[5];
        readOutArray(firstArray);
/*
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
*/
/*
        for (Animal animal : animals){
            System.out.println(animal);
        }
*/
//        checkEnhancedFor();

        Animal[] animals2 = new Animal[2];
        animals2[0] = new Dog();
        animals2[1] = new Cat();
        processAnimalArray(animals2);

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimalArray(dogs);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat();
        cats[1] = new Cat();
        processAnimalArray(cats);

        addCatToArray(animals2);
        addCatToArray(dogs);
        addCatToArray(cats);

        for (Animal animal : animals2){
            System.out.println(animal);
        }

        for (Animal animal : dogs){
            System.out.println(animal);
        }

        for (Animal animal : cats){
            System.out.println(animal);
        }

    }
}
