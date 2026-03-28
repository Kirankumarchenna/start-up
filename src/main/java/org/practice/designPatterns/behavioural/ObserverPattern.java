package org.practice.designPatterns.behavioural;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer user1 = new Investors("Kiran");
        Observer user2 = new Investors("Kumar");

        stock.subscribe(user1);
        stock.subscribe(user2);

        stock.setPrice(100);
        stock.setPrice(120.5);
    }
}

interface Observer{
    void update(double price);
}

interface Subject{
    void subscribe(Observer o);
    void unSubsribe(Observer o);
    void notifyObserver();
}

class Stock implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unSubsribe(Observer o) {
        observers.remove(0);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(price);
        }
    }
}

class Investors implements Observer{
    private String name;

    public Investors(String name){
        this.name = name;
    }

    public void update(double price){
        System.out.println(name + price);
    }
}
