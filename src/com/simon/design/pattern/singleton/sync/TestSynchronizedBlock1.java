package com.simon.design.pattern.singleton.sync;

/**
 * https://www.javatpoint.com/synchronized-block-example
 */
public class TestSynchronizedBlock1 {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
        /*
         * 0
         * 5
         * 10
         * 15
         * 20
         * 0
         * 100
         * 200
         * 300
         * 400
         */
    }
}

class Table {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
       this.t.printTable(100);
    }
}