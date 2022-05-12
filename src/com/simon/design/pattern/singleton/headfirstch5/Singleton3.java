package com.simon.design.pattern.singleton.headfirstch5;

/**
 * Double-checked locking doesn’t
 * work in Java 1.4 or earlier!
 * .
 * Watch it!
 */
public class Singleton3 {
    /**
     * The volatile keyword ensures that multiple threads
     * handle the uniqueInstance variable correctly when it
     * is being initialized to the Singleton instance.
     */
    private volatile static Singleton3 uniqueSingleton;

    // other useful instance variables here


    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (uniqueSingleton == null) { // 只有第一次创建时（=null)，才进入同步块，一旦创建，
            // 就再也不会进入外面的if，亦不会进入同步块，故实现“只同步一次”，避免同步带来的性能损失
            synchronized (Singleton3.class) { //Note we only synchronize the first time through!
                if (uniqueSingleton == null) { //heck again and if still null, create an instance
                    uniqueSingleton = new Singleton3();
                }
            }
        }
        return uniqueSingleton;
    }

    // other useful methods here
}
