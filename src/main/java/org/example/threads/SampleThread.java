package org.example.threads;

public class SampleThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread name: "+ Thread.currentThread().getName());
    }
}
