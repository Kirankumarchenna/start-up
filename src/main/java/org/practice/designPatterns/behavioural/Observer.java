package org.practice.designPatterns.behavioural;


import java.util.ArrayList;
import java.util.List;

interface Observer1 {
    void update(String message);
}

class EmailSubscriber implements Observer1 {
    private String name;

    public EmailSubscriber (String name){
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "Received email" + message);
    }
}

class SMSubscriber implements Observer1 {
    private String name;
    public SMSubscriber (String name){
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "Received SMS" + message);
    }
}

interface Subject1{
    void addObserver(Observer1 observer);
    void removeObserver(Observer1 observer);
    void notifyObservers(String message);
}

class NotificationService  implements Subject1{
    private List<Observer1> observers = new ArrayList<Observer1>();

    public void addObserver(Observer1 observer){
        observers.add(observer);
    }

    public void removeObserver(Observer1 observer){
        observers.remove(observer);
    }

    public void notifyObservers(String message){
        for (Observer1 observer : observers){
            observer.update(message);
        }
    }
}

class Main{
    public static void main(String[] args) {

    }
}

