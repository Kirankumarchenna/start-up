package org.practice.designPatterns.behavioural;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());
        context.makePayment(1000);

        context.setStrategy(new UPIPayment());
        context.makePayment(200);
    }
}

interface PaymentStrategy{
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println(amount + "Using Credit card");
    }
}

class UPIPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println(amount + "Using UPI");
    }
}

class PaymentContext{
    private PaymentStrategy paymentStrategy;
    
    public void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount){
        paymentStrategy.pay(amount);
    }
}
