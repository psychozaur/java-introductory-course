package com.podstaw.od.java.rybicki.marcin.generic;

import com.podstaw.od.java.rybicki.marcin.animal.Animal;
import com.podstaw.od.java.rybicki.marcin.animal.Cat;
import com.podstaw.od.java.rybicki.marcin.animal.Dog;

// generic
// only Animal and extends
// method enterHome(?)
// method goOutside(?)
// ? = placeholder
public class GenericAnimalHouse<E extends Animal> {

    private E animal;

    public void enterHome(E animal){
        this.animal = animal;
        animal.whichAnimal();
    }

    public E goOutside(){
        System.out.println(this.animal + " goes outside.");
        return this.animal;
    }

    public static void main(String[] args) {
//        GenericAnimalHouse<Animal>
        GenericAnimalHouse home = new GenericAnimalHouse();
//        GenericAnimalHouse<Dog> home1 = new GenericAnimalHouse<>();
//        GenericAnimalHouse<Cat> home2 = new GenericAnimalHouse<>();

        Dog dog = new Dog();
        Cat cat = new Cat();

        home.goOutside();
        home.enterHome(dog);
        Animal dog2 = home.goOutside();
        home.enterHome(cat);
        Animal cat2 = home.goOutside();

//        home1.goOutside();
//        home1.enterHome(dog);
//        Animal dog2 = home1.goOutside();
//        home2.enterHome(cat);
//        Animal cat2 = home2.goOutside();
//        home.enterHome(new String("hghgfh"));

        System.out.println(dog2);
        System.out.println(cat2);


    }
}
