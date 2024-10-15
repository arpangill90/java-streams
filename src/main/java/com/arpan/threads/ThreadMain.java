package com.arpan.threads;

public class ThreadMain {

    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        myRunnable1.run();
        myRunnable2.run();
    }
}
