package com.podstaw.od.java.rybicki.marcin;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        setName(name);
        this.surname = "Anonymous";
        setAge(-1);
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
        setAge(-1);
    }

    public Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("MarcinMarcinMarcinMarcinMarcin", "Rybicki", 27);
        Person person2 = new Person("Zuzia", "Kulik", 25);
        Person person3 = new Person("Jolanta", "KulikKulikKulikKulikKulik");
        Person person4 = new Person("Tomek");

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
        System.out.println("person4: " + person4);

        person2.setAge(201);
        System.out.println("person2: " + person2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20){
            this.name = name.substring(0, 20);
            return;
        }

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() > 20){
            this.surname = surname.substring(0,20);
            return;
        }

        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age = 0;
            System.out.println("Are you a time traveller?");
            //return;
        }
        else if (age > 200) {
            this.age = 200;
            System.out.println("Damn, you're old.");
            //return;
        }
        this.age = age;
        System.out.println("Your age is correct.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
