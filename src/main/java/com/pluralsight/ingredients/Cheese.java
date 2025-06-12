package com.pluralsight.ingredients;

import com.pluralsight.interfaces.Priceable;

public class Cheese implements Priceable {
    String selectedCheese;

    public Cheese(String selectedCheese) {
        this.selectedCheese = selectedCheese;
    }

    @Override
    public double totalPrice(int size) {
        return switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0;
        };
    }

    @Override
    public String name() {
        return selectedCheese;
    }
}
