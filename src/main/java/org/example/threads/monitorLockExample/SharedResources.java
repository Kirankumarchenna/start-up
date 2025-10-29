package org.example.threads.monitorLockExample;

public class SharedResources {
    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("Producer thread in the add item method");
        notifyAll(); //release all the locks
    }

    public synchronized void consumeItem(){

        System.out.println("Consumer Thread inside consume item method");
        if(!isItemPresent){
            try {
                System.out.println("Consumer Thread is waiting");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isItemPresent = false;
        System.out.println("The Item has been successfully consumed...:)");
    }
}
