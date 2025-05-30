package com.pluralsight.menu;

import com.pluralsight.ingredients.Topping;
import com.pluralsight.interfaces.Priceable;

import java.util.List;
import java.util.ArrayList;

public class Sandwich implements Priceable {
    private String breadType;
    private int breadSize;
    private double basePrice;
    private boolean isToasted;

    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(String breadType, int breadSize, double basePrice, boolean isToasted, List<Topping> toppings) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.basePrice = getBreadPrice();
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

    public Sandwich(String selectedSize, String selectedBreadType) {
    }

    public String getBreadType() {
        return breadType;
    }
    public int getBreadSize() {
        return breadSize;
    }
    public boolean isToasted() {
        return isToasted;
    }
    public List<Topping> getToppings() { return toppings; }

    public void setToasted(boolean toasted) { isToasted = toasted; }
    public void setToppings(List<Topping> toppings) { this.toppings = toppings; }

    public static double getBreadPrice() {
        return switch (breadSize) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0;
        };
    }
    private double getToppingPriceByCategory(String category) {
       return toppings.stream()
                .filter(t -> t.getType().equalsIgnoreCase(category))
                .mapToDouble(t -> t.isExtra()
                        ? t.getBasePrice() * .5 : t.getBasePrice())
                .sum();//returns the result directly
    }

    @Override
    public double totalPrice() {
        double total = getBreadPrice();

        total += getToppingPriceByCategory("meat");
        total += getToppingPriceByCategory("cheese");
        total += getToppingPriceByCategory("regular");
        total += getToppingPriceByCategory("sauce");

        return total;
    }
    @Override
    public String toString() {
        return breadSize + "\" " + (isToasted ? "Toasted" : "Not Toasted") + " " + breadType + " Sandwich with " + toppings.size() + " toppings. $" + totalPrice();
}}