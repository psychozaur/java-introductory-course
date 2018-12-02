package com.podstaw.od.java.rybicki.marcin.collection.map;

import com.podstaw.od.java.rybicki.marcin.equals_and_hashcode.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchingPeopleExample {

    public static Map<String, Person> generatePersonMap (){
        // 1)
        Map<String, Person> personMap = new HashMap<>();
        // 2)
        personMap.put("90",new Person("Marcin","Rybicki",28));
        personMap.put("95",new Person("Marek","Kowalski",23));
        personMap.put("96",new Person("Darek","Rycerz",22));
        personMap.put("89",new Person("Mariusz","Rybiński",29));
        personMap.put("97",new Person("Martyna","Szpadel",21));
        personMap.put("98",new Person("Arkadiusz","Dynks",20));
        personMap.put("93",new Person("Ludwik","Armata",25));
        personMap.put("92",new Person("Marcypiusz","Cytrzyński",26));
        personMap.put("91",new Person("Ahmed","Abdul",27));
        personMap.put("90",new Person("Jane","Smith",28));

        return personMap;
    }

    public static List<Person> findPeopleYoungerThan25 (Map<String,Person> personMap){
        List<Person> personList = new ArrayList<>();

        for (String s : personMap.keySet()){
            // 3)
            if (personMap.get(s).getAge() < 25){
                // 4)
                personList.add(personMap.get(s));
            }
        }

        return personList;
    }

    public static void main(String[] args) {
        //map ids over Person
        //add 10 people to map
        //find only people younger than 25
        //add result to list

        Map<String, Person> personMap = generatePersonMap();
        List<Person> personList = findPeopleYoungerThan25(personMap);

        for (Person p : personList){
            System.out.println(p);
        }

    }
}
