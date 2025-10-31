package org.example.threads.threadPool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTreadPoolPractice {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 8; i++) {
            executor.submit(() -> {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(20000);
                } catch (Exception e) {
                    System.out.println("Threads Terminated: " + Thread.currentThread().getName());
                }
            });
        }
        executor.shutdown();
        if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
            List<Runnable> pendingTasks = executor.shutdownNow();
            System.out.println("Number of pending tasks left: " + pendingTasks.size());
            System.out.println("Pending task at first index: " + pendingTasks.get(0));
        }
    }

}
