package com.simon.design.pattern.singleton;
/**
 * basic singleton
 */
public class SingletonSingleThread {
    private static SingletonSingleThread instance;
    public String value;

    private SingletonSingleThread(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonSingleThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonSingleThread(value);
        }
        return instance;
    }
}
