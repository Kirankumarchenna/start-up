package org.example.threads;

public class App {
    public static void main(String[] args) {

        System.out.println("GO inside main method "+ Thread.currentThread().getName());
        SampleThread thread = new SampleThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
        System.out.println("after main method" +  Thread.currentThread().getName());

        SampleTwoThread sampleTwoThread = new SampleTwoThread();
        Thread thread2 = new Thread(sampleTwoThread);
        thread2.start();
    }
}
