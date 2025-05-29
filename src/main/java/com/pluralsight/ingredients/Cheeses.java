package com.pluralsight.ingredients;

public class Cheeses {
  private String name;
  private double cheeseBasePrice;

    public Cheeses(String name, double cheeseBasePrice) {
        this.name = name;
        this.cheeseBasePrice = cheeseBasePrice;
    }

    public String getName() { return name; }
    public double getCheeseBasePrice() { return cheeseBasePrice; }

    public void setName(String name) { this.name = name; }
    public void setCheeseBasePrice(double cheeseBasePrice) { this.cheeseBasePrice = cheeseBasePrice; }
}
