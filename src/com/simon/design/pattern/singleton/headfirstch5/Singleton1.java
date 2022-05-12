package com.simon.design.pattern.singleton.headfirstch5;

public class Singleton1 {
    private static Singleton1 uniqueSingleton;

    // other useful instance variables here


    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance(){
        if(uniqueSingleton == null) {
            uniqueSingleton = new Singleton1();
        }
        return uniqueSingleton;
    }

    // other useful methods here
}
