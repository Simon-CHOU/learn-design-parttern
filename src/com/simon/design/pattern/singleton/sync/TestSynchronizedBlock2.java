package com.simon.design.pattern.singleton.sync;

/**
 * https://www.javatpoint.com/synchronized-block-example
 */
public class TestSynchronizedBlock2 {
    public static void main(String[] args) {
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hola", sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to Javapoint website", sender);
        sender1.start();
        sender2.start();

        try {
            sender1.join();
            sender2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        /*
         * Sending a Message: Hola
         *
         * Hola Sent
         *
         * Sending a Message: Welcome to Javapoint website
         *
         * Welcome to Javapoint website Sent
         */
    }
}

class Sender {
    public void SendMsg(String msg) {
        System.out.println("\nSending a Message: " + msg);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + " Sent");
    }
}
class SenderWThreads extends Thread{
    private final String msg;
    final Sender sd;

    SenderWThreads(String m, Sender obj){
        msg = m;
        sd = obj;
    }

    @Override
    public void run() {
        synchronized (sd) {
            sd.SendMsg(msg);
        }
    }
}
