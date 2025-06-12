package com.pluralsight.ingredients;

import com.pluralsight.interfaces.Priceable;

public class Meat implements Priceable {

    String selectedMeat;

    public Meat(String selectedMeat) {
       this.selectedMeat = selectedMeat;
    }

    @Override
    public double totalPrice(int size) {
        return switch (size) {
            case 4 -> 1.00 ;
            case 8 -> 2.00 ;
            case 12 -> 3.00 ;
            default -> 0;
        };
    }

    @Override
    public String name() {
        return selectedMeat;
    }
}
