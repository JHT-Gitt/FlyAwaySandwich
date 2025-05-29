package com.pluralsight.ingredients;

public class Toppings {
    private String name;
    private double toppingBasePrice;

    public Toppings(String name, double toppingBasePrice) {
        this.name = name;
        this.toppingBasePrice = toppingBasePrice;
    }

    public String getName() { return name; }
    public double getToppingBasePrice() { return toppingBasePrice; }

    public void setName(String name) { this.name = name; }
    public void setToppingBasePrice(double toppingBasePrice) { this.toppingBasePrice = toppingBasePrice; }
}
