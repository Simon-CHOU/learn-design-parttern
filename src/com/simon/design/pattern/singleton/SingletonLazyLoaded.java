package com.simon.design.pattern.singleton;

/**
 * singleton thread safe
 */
public class SingletonLazyLoaded {
    private static volatile SingletonLazyLoaded instance;

    public String value;

    public SingletonLazyLoaded(String value) {
        this.value = value;
    }

    public static SingletonLazyLoaded getInstance(String value) {
        SingletonLazyLoaded result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SingletonLazyLoaded.class) {
            if (instance == null) {
                instance = new SingletonLazyLoaded(value);
            }
            return instance;
        }
    }
}
