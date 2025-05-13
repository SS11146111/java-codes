package com.sangita.designpatterns;
interface Coffee {
    String getDescription();
    double cost();
}

class BasicCoffee implements Coffee {
    public String getDescription() { return "Plain Coffee"; }
    public double cost() { return 5; }
}

class MilkDecoratorDemo implements Coffee {
    private Coffee coffee;
    public MilkDecoratorDemo(Coffee coffee) { this.coffee = coffee; }
    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double cost() { return coffee.cost() + 1.5; }
}

