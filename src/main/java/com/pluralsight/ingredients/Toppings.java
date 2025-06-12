package com.pluralsight.ingredients;

import com.pluralsight.interfaces.Priceable;

import java.util.List;

public class Toppings implements Priceable {

    String selectedToppings;

    public Toppings(String selectedToppings) {
        this.selectedToppings = selectedToppings;
    }

    @Override
    public double totalPrice(int size) {
        return 0;
    }

    @Override
    public String name() {
        return selectedToppings;
    }
}
