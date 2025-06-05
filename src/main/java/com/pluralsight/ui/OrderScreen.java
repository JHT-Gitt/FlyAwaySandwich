package com.pluralsight.ui;

import com.pluralsight.helpers.InputHelper;
import com.pluralsight.helpers.OrderHelper;

public class OrderScreen {
    public void display() {
        System.out.println("welcome to the order menu\n");
        System.out.println("1) Add Sandwich\n2) Add Drink\n 3) Add Chips\n4)Checkout\n0) Cancel Order");
        System.out.println("Please choose in number format");
        InputHelper.getInt("");

        switch (InputHelper.getInt("")) {
            case 1 -> {
                OrderHelper.addSandwich();
                break;
            }
            case 2 -> {
                OrderHelper.addDrink();
                break;
            }
            case 3 -> {
                OrderHelper.addChips();
                break;
            }
            case 4 -> {
                OrderHelper.checkout();
                break;
            }
            case 0 -> {
                OrderHelper.cancelOrder();
                return;
            }
            default -> throw new IllegalStateException("Unexpected value: " + InputHelper.getInt(""));
        }
    }
}
