package com.podstaw.od.java.rybicki.marcin.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {

    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>();
        System.out.println(idsOverNames.put("90","Marcin"));
        System.out.println(idsOverNames.put("95","Marek"));
        System.out.println(idsOverNames.put("99","Arek"));
        System.out.println(idsOverNames.put("91","Darek"));
        System.out.println(idsOverNames.put("89","Kasia"));

        for (String key : idsOverNames.keySet()){
            System.out.println("Key: " + key + ", value: " + idsOverNames.get(key));
        }

        Map<String, String> secondMap = new LinkedHashMap<>();

        secondMap.put("90","Marcin");
        secondMap.put("93","Marc");
        secondMap.put("96","Mar");
        secondMap.put("97","Ma");
        secondMap.put("91","M");

        for (String key : secondMap.keySet()){
            System.out.println("Key: " + key + ", value: " + secondMap.get(key));
        }

    }
}
