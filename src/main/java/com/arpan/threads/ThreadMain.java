package com.arpan.threads;

public class ThreadMain {

    public static void main(String[] args) {

        //The first example - each thread has its own runnable - separate reference in the heap
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread1 = new Thread(myRunnable1, "Thread-1");

        MyRunnable myRunnable2 = new MyRunnable();
        Thread thread2 = new Thread(myRunnable2, "Thread-2");

        thread1.start();
        thread2.start();

        //The second example - 2 threads using same runnable - same reference in the heap
        //thread stack is different
        MyRunnable myRunnable3 = new MyRunnable();
        Thread thread3 = new Thread(myRunnable3, "Thread-3");
        Thread thread4 = new Thread(myRunnable3, "Thread-4");

        thread3.start();
        thread4.start();
    }
}
