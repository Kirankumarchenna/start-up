package org.practice.threads;

/**
 * Hello world!
 *
 */

public class SampleTwoThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2 name: "+ Thread.currentThread().getName());
    }
}
