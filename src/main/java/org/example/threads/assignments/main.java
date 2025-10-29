package org.example.threads.assignments;

public class main {
    public static void main(String[] args) {
        SharedResource sharedBuffer = new SharedResource(2);

        Thread producerThread = new Thread(()->{
            for(int i=1; i<=6; i++){
                try {
                    sharedBuffer.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i=1; i<=6; i++){
                try {
                    sharedBuffer.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
