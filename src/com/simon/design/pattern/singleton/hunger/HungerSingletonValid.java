package com.simon.design.pattern.singleton.hunger;

/**
 * <a>https://blog.csdn.net/weixin_39531834/article/details/111361150</a>
 */
public class HungerSingletonValid {
    private HungerSingletonValid() {
        System.out.println(Thread.currentThread().getName() + "我是构造方法");
    }

    private static HungerSingletonValid instance;

    static {
        instance = new HungerSingletonValid();
    }

    public static HungerSingletonValid getInstance() {
        System.out.println(Thread.currentThread().getName() + "getInstance: "+ instance);
        return instance;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    HungerSingletonValid.getInstance();
//                }
//            });
//            thread.start();
//        }
        System.out.println("前面的代码已经注释，即getInstance不会被调用" +
                "但是 “main我是构造方法还是打印出来了");
        //当虚拟机执行一个main方法时，会首先初始化main所在的这个主类。所以会初始化单例模式类。
        //单例对象调用了构造器，在类初始化时，单例对象就初始化了。不管有没有真的调用。
        // 疑问：就实现饿汉单例而言，构造器初始化和static代码块中初始化，有什么区别？
    }
}
