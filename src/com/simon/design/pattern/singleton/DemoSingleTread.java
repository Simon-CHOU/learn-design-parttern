package com.simon.design.pattern.singleton;

public class DemoSingleTread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then the singleton was reused(good)" +
                "\nIf you see different values, then 2 singleton were created(bad)\n" +
                "RESULT: \n");
        SingletonSingleThread singleton = SingletonSingleThread.getInstance("FOO");
        SingletonSingleThread  anotherSingleton = SingletonSingleThread.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
