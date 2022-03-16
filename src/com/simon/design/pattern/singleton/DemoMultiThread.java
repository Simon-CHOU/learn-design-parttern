package com.simon.design.pattern.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then the singleton was reused(good)" +
                "\nIf you see different values, then 2 singleton were created(bad)\n" +
                "RESULT: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadFar = new Thread(new ThreadBar());
        threadFoo.start();
        threadFar.start();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonSingleThread singleton = SingletonSingleThread.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonSingleThread singleton = SingletonSingleThread.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
