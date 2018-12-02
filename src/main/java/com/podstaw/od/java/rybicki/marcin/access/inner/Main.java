package com.podstaw.od.java.rybicki.marcin.access.inner;

import com.podstaw.od.java.rybicki.marcin.access.Person;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Marcin","Rybicki",-3);
        System.out.println(me);
        me.setAge(-50);
        System.out.println(me);

//        me.secret = "my secret";
//        me.secondSecret = "second secret";

        Child child = new Child();
        child.sayHello();
    }
}
