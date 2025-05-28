package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class Meats {
    private List<String> meats = new ArrayList<>();
    private String name;
    private double meatsBasePrice;

    public Meats(List<String> meats, String name, double price) {
        this.meats = meats;
        this.name = name;
        this.meatsBasePrice = price;
    }

    public String getName() { return name; }
    public double getMeatsBasePrice() { return meatsBasePrice; }

    public void setMeats(List<String> meats) { this.meats = meats; }
    public void setName(String name) { this.name = name; }
    public void setMeatsBasePrice(double meatsBasePrice) { this.meatsBasePrice = meatsBasePrice; }

    public void meatsOptions() {
        meats.add("Steak");
        meats.add("Ham");
        meats.add("Salami");
        meats.add("Roast Beef");
        meats.add("Chicken");
        meats.add("Bacon");
    }

    public List<String> getMeats() {
        return meats;
    }
}
