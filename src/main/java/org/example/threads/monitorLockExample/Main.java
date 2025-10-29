package org.example.threads.monitorLockExample;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResourcesObj = new SharedResources();

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResourcesObj.addItem();
        });

        Thread consumerThread = new Thread(sharedResourcesObj::consumeItem);

        producerThread.start();
        consumerThread.start();
    }
}
