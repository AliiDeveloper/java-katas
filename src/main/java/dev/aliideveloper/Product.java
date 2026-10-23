package dev.aliideveloper;


public class Product {

    String name;
    double price;

    private Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}








