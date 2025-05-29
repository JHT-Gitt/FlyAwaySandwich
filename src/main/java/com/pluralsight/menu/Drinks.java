package com.pluralsight.menu;

public class Drinks {
    private String name;
    private String size;
    private double price;
    private boolean isFountainDrink;

    public Drinks(String name, String size, double price, boolean isFountainDrink) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.isFountainDrink = isFountainDrink;
    }

    public String getName() { return name; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public boolean isFountainDrink() { return isFountainDrink; }

    public void setName(String name) { this.name = name; }
    public void setSize(String size) { this.size = size; }
    public void setPrice(double price) { this.price = price; }
    public void setFountainDrink(boolean fountainDrink) { isFountainDrink = fountainDrink; }
}
