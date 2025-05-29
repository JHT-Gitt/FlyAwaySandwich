package com.pluralsight.ingredients;


public class Meats {
    private String name;
    private double meatBasePrice;

    public Meats(String name, double meatBasePrice) {
        this.name = name;
        this.meatBasePrice = meatBasePrice;
    }

    public String getName() { return name; }
    public double getMeatBasePrice() { return meatBasePrice; }

    public void setName(String name) { this.name = name; }
    public void setMeatBasePrice(double meatBasePrice) { this.meatBasePrice = meatBasePrice; }
}
