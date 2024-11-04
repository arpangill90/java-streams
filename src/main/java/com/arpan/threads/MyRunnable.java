package com.arpan.threads;

public class MyRunnable implements Runnable{

    //This is added as an example of race condition
    // if 2 threads use same myRunnable, both would try to increment the counter and cause race condition
    private int counter;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            //synchronized should be used with care, can cause performance issues, deadlock and many other problems
            synchronized (this) { //This means 1 thread has access to the counter --> in this example, only second thread to finish will reach 2 mil
                counter++;
            }
        }
        System.out.println(counter);
    }
}
