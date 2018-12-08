package com.podstaw.od.java.rybicki.marcin.anonymous_classes;

public class Main {

    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal parrot = new Animal(){
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };

        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }

            public void makeSound(){
                System.out.println("quack, quack");
            }
        };

//        new Animal() {
//            @Override
//            public void printAnimalName() {
//                System.out.println("Duck");
//            }
//
//            public void makeSound(){
//                System.out.println("quack, quack");
//            }
//        }.makeSound();

        Monkey monkey1 = new Monkey(){
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };

        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal(){
            @Override
            public void printAnimalName() {
                System.out.println("I'm a duck. Seriously.");
            }
        });
        processor.processAnimal(monkey1);

        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Cake is a lie");
            }
        };

        SecretProcessor processor2 = new SecretProcessor();
        processor2.processSecret(secret);

        processor2.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("I'm a secret. Tell no one.");
            }
        });

    }
}
