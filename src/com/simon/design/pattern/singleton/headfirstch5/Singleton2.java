package com.simon.design.pattern.singleton.headfirstch5;

public class Singleton2 {
    private static Singleton2 uniqueSingleton =new Singleton2();

    // other useful instance variables here


    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        return uniqueSingleton;
    }

    // other useful methods here
}
