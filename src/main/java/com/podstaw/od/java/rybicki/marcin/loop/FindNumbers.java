package com.podstaw.od.java.rybicki.marcin.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    //List<Integer>
    //1000 elements - 1 : 100 Random
    //first occurence of 51 - print index of 51
    //use break;

    public List<Integer> createList(){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++){
            list.add(new Random().nextInt(101)); // 0 - 100 inclusive?
        }

        return list;
    }

    public void findFirstOccurenceOf51(List<Integer> list){

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 51){
                System.out.println( "Index of first occurence: " + i);
                break;
            }
        }

    }

    public void findLastOccurenceOf51(List<Integer> list){
        for (int index = list.size() - 1; index >= 0; index--){
            if (list.get(index) == 51){
                System.out.println( "Index of last occurence: " + index);
                break;
            }
        }
    }

    public void printNoOfOccurencesOf51(List<Integer> list){
        int count = 0;

        for (Integer element : list){
            if (element == 51) count++;
        }

        System.out.println("Number of occurences: " + count);
    }

    public static void main(String[] args) {

        FindNumbers finder = new FindNumbers();
        List <Integer> list = finder.createList();
        finder.findFirstOccurenceOf51(list);
        finder.findLastOccurenceOf51(list);
        finder.printNoOfOccurencesOf51(list);

//      nullpointerexception klasyczny - int musi mieć wartość, nie jest referencją
//        Integer aa = null;
//        int b = aa;

    }

}
