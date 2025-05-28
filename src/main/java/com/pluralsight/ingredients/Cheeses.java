package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class Cheeses {
    private List<String> cheeses = new ArrayList<>();
    private String name;
    private double cheeseBasePrice;

    public Cheeses(List<String> cheeses, String name, double price) {
        this.cheeses = cheeses;
        this.name = name;
        this.cheeseBasePrice = price;
    }
    public String getName() { return name; }
    public double getCheeseBasePrice() { return cheeseBasePrice; }

    public void setCheeses(List<String> cheeses) { this.cheeses = cheeses; }
    public void setName(String name) { this.name = name; }
    public void setCheeseBasePrice(double cheeseBasePrice) { this.cheeseBasePrice = cheeseBasePrice; }

    public void cheeseOptions() {
        cheeses.add("American");
        cheeses.add("Provolone");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
    }
    public List<String> getCheeses() {
        return cheeses;
    }


}
