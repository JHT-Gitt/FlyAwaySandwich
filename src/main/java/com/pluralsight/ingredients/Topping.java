package com.pluralsight.ingredients;

public class Topping {
    private String type; //filter by category
    private String name;
    private double basePrice;
    private boolean isExtra;//additional cost if true

    public Topping(String type, String name, double basePrice, boolean isExtra) {
        this.type = type;
        this.name = name;
        this.basePrice = basePrice;
        this.isExtra = isExtra;
    }

    public Topping(String selectedMeat, String meat, boolean isExtraMeat) {
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public boolean isExtra() { return isExtra; }

    public void setType(String type) { this.type = type;}
    public void setName(String name) { this.name = name; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }
    public void setExtra(boolean extra) { isExtra = extra; }

    @Override
    public String toString() {
        return name + (isExtra ? " (extra)" : "");
    }
}
