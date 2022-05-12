package com.simon.design.pattern.singleton.headfirstch5;

public class Singleton0 {
    private static Singleton0 uniqueSingleton;

    // other useful instance variables here


    private Singleton0() {
    }

    public static Singleton0 getInstance(){
        if(uniqueSingleton == null) {
            uniqueSingleton = new Singleton0();
        }
        return uniqueSingleton;
    }

    // other useful methods here
}
