package com.simon.design.pattern.singleton;

public class DemoMultiThreadLazy {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        //results are the same: FOO or BAR
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonLazyLoaded singleton = SingletonLazyLoaded.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonLazyLoaded singleton = SingletonLazyLoaded.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

}
