package com.simon.design.pattern.singleton.headfirstch5;

import java.util.concurrent.CountDownLatch;

/**
 * 另一种看起来和书上不同的单例模式
 * https://blog.csdn.net/hewei314599782/article/details/80145270
 * 运行结果打印一个就对了
 *
 *
 *
 * 下面例子是最好的单例模式两种，都是懒加载，只会创建一次。
 *
 * 双重锁 ，内部类
 */
public class MultiThreadSim {

    private static class Inner {
        private static MultiThreadSim t = new MultiThreadSim();
    }

    MultiThreadSim() {
        System.out.println(this.hashCode());
    }

    private static MultiThreadSim t;

    public static MultiThreadSim getSignle() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (t == null) {
            synchronized (MultiThreadSim.class) {
                if (t == null) {
                    t = new MultiThreadSim();
                }
            }
        }
        return t;
    }

    static CountDownLatch latch = new CountDownLatch(10000);

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            Thread th = new Thread(MultiThreadSim::getSignle);
            th.start();
            latch.countDown();
        }
    }


}
