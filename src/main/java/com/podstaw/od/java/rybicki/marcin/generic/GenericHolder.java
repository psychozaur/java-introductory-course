package com.podstaw.od.java.rybicki.marcin.generic;

public class GenericHolder<E> {

    E secret;

    public E getSecret(){
        return this.secret;
    }

    public void setSecret(E secret) {
        this.secret = secret;
    }
}
