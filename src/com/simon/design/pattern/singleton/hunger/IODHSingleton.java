package com.simon.design.pattern.singleton.hunger;

/**
 * Initialization Demand Holder (IoDH)
 * 实现延迟加载
 * https://blog.csdn.net/weixin_39531834/article/details/111361150
 */
public class IODHSingleton {
    public IODHSingleton() {
        System.out.println("初始化");
    }

    private static class StaticInnerSingleton {
        private static final IODHSingleton instance = new IODHSingleton();
    }

    public static IODHSingleton getInstance() {
        System.out.println(Thread.currentThread().getName() + "getInstance: "+StaticInnerSingleton.instance);
        return StaticInnerSingleton.instance;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    IODHSingleton.getInstance();
//                }
//            });
//            thread.start();
//        }
        System.out.println("前面的调用已经注释，单例对象不会被初始化");
    }
}
