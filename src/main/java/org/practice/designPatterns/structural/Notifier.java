package org.practice.designPatterns.structural;

/*
    The Decorator Pattern allows you to add new functionality
    to an object dynamically without altering its original structure.
 */

interface Notifier {
    void send(String message);
}

class BasicNotifier implements Notifier{
    public void send(String message){
        System.out.println("Send basic notification: " + message);
    }
}

abstract class NotifierDecorator implements Notifier{

    protected  Notifier wrappedNotifier;
    public NotifierDecorator(Notifier notifier){
        this.wrappedNotifier = notifier;
    }

    public void send(String message){
        wrappedNotifier.send(message);
    }
}

class SmsDecorator extends NotifierDecorator{
    public SmsDecorator(Notifier notifier){
        super(notifier);
    }

    public void send(String message){
        super.send(message);
        System.out.println("Also sending sms: "+ message);
    }
}

class EmailDecorator extends NotifierDecorator{
    public EmailDecorator(Notifier notifier){
        super(notifier);
    }
    public void send(String message){
        super.send(message);
        System.out.println("Also sending email: "+ message);
    }
}

class Main1 {
    public static void main(String[] args){
        Notifier notifier = new BasicNotifier();
        SmsDecorator smsDecorator = new SmsDecorator(notifier);
        EmailDecorator emailDecorator = new EmailDecorator(notifier);
        smsDecorator.send("Hello World!");
    }
}
