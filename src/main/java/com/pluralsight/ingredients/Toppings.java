package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class Toppings {
    private List<String> toppings = new ArrayList<>();
    private String name;
    private double toppingBasePrice;

    public void toppingOptions() {
        toppings.add("Lettuce");
        toppings.add("Peppers");
        toppings.add("Onions");
        toppings.add("Tomatoes");
        toppings.add("Jalapeños");
        toppings.add("Cucumbers");
        toppings.add("Pickles"); //🤮
        toppings.add("Guacamole");
        toppings.add("Mushrooms");
    }
    public List<String> getToppings() {
        return toppings;
    }
}
