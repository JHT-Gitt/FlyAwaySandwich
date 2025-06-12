package com.pluralsight.ui;

import com.pluralsight.helpers.InputHelper;
import com.pluralsight.helpers.OrderHelper;
import com.pluralsight.recipts.ReceiptWriter;

public class OrderScreen {
    OrderHelper os = new OrderHelper();
    HomeScreen hs = new HomeScreen();
    public void display() {
        System.out.println("\nwelcome to the order menu\n");
        System.out.println("1) Add Sandwich\n2) Add Drink\n3) Add Chips\n4) Checkout\n0) Cancel Order");
        System.out.print("Please choose a number: ");
        int choice = InputHelper.getInt("");

        switch (choice) {
            case 1 -> {
                os.addSandwich();
                //OrderHelper.addSandwich();
                display();
            }
            case 2 -> {
              //  OrderHelper.addDrink();
                display();

            }
            case 3 -> {
              //  OrderHelper.addChips();
                display();

            }
            case 4 -> {
                os.printReceipt();
              //  OrderHelper.checkout();

                System.out.println(" 1 - Checkout \n 2 - Return\n ");
                System.out.print("Enter: ");
                int input = InputHelper.getInt("");
                switch (input) {
                    case 1 ->{
                        String finalReceipt = os.check();
                        ReceiptWriter.writeReceipt(finalReceipt);
                        System.out.println("\nThanks for shopping and Goodbye\n\n");
                        os.cancelOrder();
                    }
                    case 2 -> display();
                }
            }
            case 0 -> {
                os.cancelOrder();
               // OrderHelper.cancelOrder();
                return;
            }
            default -> throw new IllegalStateException("Unexpected value: " + InputHelper.getInt(""));
        }
    }
}
