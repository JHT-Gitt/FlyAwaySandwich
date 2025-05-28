package com.pluralsight.ui;

import com.pluralsight.helpers.InputHelper;
import com.pluralsight.helpers.OrderHelper;

public class OrderScreen {
    public void orderS() {
        System.out.println("welcome to the order menu\n");
        System.out.println("1) Add Sandwich\n2) Add Drink\n 3) Add Chips\n4)Checkout\n0) Cancel Order");
        System.out.println("Please choose in number format");
        InputHelper.getInt("");

        switch (InputHelper.getInt("")) {
            case 1 -> System.out.println();

            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> System.out.println();
            case 0 -> System.out.println();
            default -> throw new IllegalStateException("Unexpected value: " + InputHelper.getInt(""));
        }
    }
}
