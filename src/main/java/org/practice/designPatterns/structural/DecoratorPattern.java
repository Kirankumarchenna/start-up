package org.practice.designPatterns.structural;

public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription());
    }
}

interface Coffee{
    String getDescription();
}

class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Simple-coffee";
    }
}

class MilkDecorator implements Coffee{

    Coffee coffee;

    MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + " Milk";
    }
}
