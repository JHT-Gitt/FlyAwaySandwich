package com.pluralsight.menu;

import com.pluralsight.ingredients.Toppings;
import com.pluralsight.interfaces.Priceable;

import java.util.List;
import java.util.ArrayList;

public class Sandwich implements Priceable {
    private String breadType;
    private int breadSize;
    private boolean isToasted;
;
    private List<Toppings> toppings = new ArrayList<>();

    public Sandwich(String breadType, int breadSize, boolean isToasted, List<Toppings> toppings) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.isToasted = isToasted;
        this.toppings = toppings;
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
    public List<Toppings> getToppings() { return toppings; }

    @Override
    public void totalPrice() {

    }
}