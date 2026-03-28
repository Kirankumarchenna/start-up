package org.practice.designPatterns.creational.factory;

/*
    Instead of creating objects directly with new, you use a Factory class that decides which object to create.
 */

interface Notification{
    void notifyUser();
}

class SMS implements Notification{
    public void notifyUser(){
        System.out.println("This is SMS notification..");
    }
}

class Email implements Notification{
    public void notifyUser(){
        System.out.println("This is Email notification..");
    }
}

class NotificationFactory{

    public Notification getNotification(String notification){
        if(notification == null){
            return null;
        }
        if(notification.equalsIgnoreCase("sms")){
            return new SMS();
        } else if(notification.equalsIgnoreCase("email")){
            return new Email();
        }
        return null;
    }
}

class Main{
    public static void main(String[] args){
        NotificationFactory nf = new NotificationFactory();
        Notification nf1 = nf.getNotification("Email");
        nf1.notifyUser();
    }
}