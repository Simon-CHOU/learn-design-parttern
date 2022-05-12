package com.simon.design.pattern.singleton.headfirstch5;

import java.util.HashSet;
import java.util.Set;

public class BoilerTestDriver {
    public static void main(String[] args) {
        Set<ChocolateBoilerSingleton> instanceHashCodeSet1 = new HashSet<>();
        Set<ChocolateBoiler> instanceHashCodeSet2 = new HashSet<>();
        Runnable runnableSingleton = () -> {
            ChocolateBoilerSingleton boiler = ChocolateBoilerSingleton.getInstance();
            int i = boiler.hashCode();
            instanceHashCodeSet1.add(boiler);
            System.out.println(i);
        };
        Runnable runnableNonSingle = () -> {
            ChocolateBoiler boiler = new ChocolateBoiler();
            int i = boiler.hashCode();
            instanceHashCodeSet2.add(boiler);
            System.out.println(i);
        };
        for (int i = 0; i < 1000; i++) {
            new Thread(runnableSingleton).start();
        }
        for (int i = 0; i < 1000; i++) {
            new Thread(runnableNonSingle).start();
        }

        System.out.println("==== sum ===\nsingleton:" + instanceHashCodeSet1.size() + " instance has been created\n"
                + "non-singleton: " + instanceHashCodeSet2.size() + " instance has been created");
        // 疑问，为什么size不是1，单例模式失败了？
    }
}
