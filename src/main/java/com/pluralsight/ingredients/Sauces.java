package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class Sauces {
    private List<String> sauces = new ArrayList<>();
    private String name;
    private double sauceBasePrice;

    public Sauces(List<String> sauces, String name, double price) {
        this.sauces = sauces;
        this.name = name;
        this.sauceBasePrice = price;
    }

    public String getName() { return name; }
    public double getSauceBasePrice() { return sauceBasePrice; }

    public void setSauces(List<String> sauces) { this.sauces = sauces; }
    public void setName(String name) { this.name = name; }
    public void setSauceBasePrice(double sauceBasePrice) { this.sauceBasePrice = sauceBasePrice; }

    public void sauceOptions() {
        sauces.add("Mayo");
        sauces.add("Mustard");
        sauces.add("Ketchup");
        sauces.add("Ranch");
        sauces.add("Thousand Island");
        sauces.add("Vinaigrette");
    }
    public List<String> getSauces() {
        return sauces;
    }
}
