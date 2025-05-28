package com.pluralsight.menu;

import com.pluralsight.ingredients.Cheeses;
import com.pluralsight.ingredients.Meats;
import com.pluralsight.ingredients.Sauces;
import com.pluralsight.ingredients.Toppings;
import com.pluralsight.interfaces.Priceable;

import java.awt.*;

public class Sandwich implements Priceable {
    private String breadType;
    private int breadSize;
    private boolean isToasted;

    private List<Meats> meatsList;
    private List<Cheeses> cheesesList;
    private List<Toppings> toppingsList;
    private List<Sauces> saucesList;

    public Sandwich(String breadType, int breadSize, boolean isToasted, meatsList, cheesesList, toppingsList, saucesList) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.isToasted = isToasted;
        this.meatsList = meatsList;
        this.cheesesList = cheesesList;
        this.toppingsList = toppingsList;
        this.saucesList = saucesList;
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