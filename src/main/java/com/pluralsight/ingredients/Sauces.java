package com.pluralsight.ingredients;

public class Sauces {
    private String name;
    private double sauceBasePrice;

    public Sauces(String name, double sauceBasePrice) {
        this.name = name;
        this.sauceBasePrice = sauceBasePrice;
    }

    public String getName() { return name; }
    public double getSauceBasePrice() { return sauceBasePrice; }

    public void setName(String name) { this.name = name; }
    public void setSauceBasePrice(double sauceBasePrice) { this.sauceBasePrice = sauceBasePrice; }
}
