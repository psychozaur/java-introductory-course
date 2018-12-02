package com.podstaw.od.java.rybicki.marcin.computer;

public class Main {

    public static void main(String[] args) {
        Computer pc = new PC();
        Computer laptop = new Laptop();
        Computer mf = new Mainframe();

        changeDiscAndPrint(pc);
        changeDiscAndPrint(laptop);
        changeDiscAndPrint(mf);
        changeDiscAndPrint(new Laptop());
    }

    public static void changeDiscAndPrint(Computer computer){
        System.out.println("changeDisc() from Main");
        //metoda polimorficzna
        computer.changeDisc();
        //metody statyczne - działają na typie referencji, a nie obiektu
        computer.print();
        //bezpośrednio z klasy
        Computer.print();
        System.out.println();
    }
}
