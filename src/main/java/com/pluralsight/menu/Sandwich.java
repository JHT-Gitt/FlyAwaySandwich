package com.pluralsight.menu;

import com.pluralsight.ingredients.Cheeses;
import com.pluralsight.ingredients.Meats;
import com.pluralsight.ingredients.Sauces;
import com.pluralsight.ingredients.Toppings;
import com.pluralsight.interfaces.Priceable;

import java.util.List;
import java.util.ArrayList;

public class Sandwich implements Priceable {
    private String breadType;
    private int breadSize;
    private boolean isToasted;

    private List<Cheeses> cheeses = new ArrayList<>();
    private List<Meats> meats = new ArrayList<>();
    private List<Sauces> sauces = new ArrayList<>();
    private List<Toppings> toppings = new ArrayList<>();

    public Sandwich(String breadType, int breadSize, boolean isToasted) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.isToasted = isToasted;


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

    @Override
    public void totalPrice() {

    }
}