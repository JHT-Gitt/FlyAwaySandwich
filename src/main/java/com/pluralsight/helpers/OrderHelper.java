package com.pluralsight.helpers;

import com.pluralsight.ui.CheckoutScreen;

import java.util.List;

public class OrderHelper {
    public static void addSandwich() {


        List<String> breadTypes = List.of("White", "Wheat", "Rye", "Wrap");
        System.out.println("What type of bread would you like?");
        System.out.println("------------------------------------------------------------");
        breadTypes.forEach(breadType -> System.out.println("-" + breadType));
        System.out.println("------------------------------------------------------------");
        String selectedBreadType = InputHelper.getString("Enter your bread type: ");

        List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");
        System.out.println("🥩 Choose a Protein");
        System.out.println("------------------------------------------------------------");
        meats.forEach(meat -> System.out.println("🥩 " + meat));
        System.out.println("------------------------------------------------------------");
        String selectedMeat = InputHelper.getString("Enter your protein: ");
        System.out.println("Would you like extra " + selectedMeat + "? (yes/no)");
        String extraToppingInput = InputHelper.getString("> ");
        boolean isExtraTopping = extraToppingInput.equalsIgnoreCase("yes");


        List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");
        System.out.println("🧀 Choose your Cheese:");
        System.out.println("------------------------------------------------------------");
        cheeses.forEach(cheese -> System.out.println("🧀 " + cheese));
        System.out.println("------------------------------------------------------------");
        String selectedCheese = InputHelper.getString("Enter your cheese: ");
        System.out.println("Would you like extra " + selectedCheese + "? (yes/no)");
        String extraToppingInput = InputHelper.getString("> ");
        boolean isExtraTopping = extraToppingInput.equalsIgnoreCase("yes");


        List<String> regularToppings = List.of(
                "Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapeños", "Cucumbers",
                "Pickles", "Guacamole", "Mushrooms");
        System.out.println("🥬 Regular Toppings");
        System.out.println("------------------------------------------------------------");
        regularToppings.forEach(topping -> System.out.println("🥬 " + topping));
        System.out.println("------------------------------------------------------------");
        String selectedTopping = InputHelper.getString("Enter a topping (type 'none' to skip or enter one at a time): ");
        while (true) {
            System.out.println("Enter topping:");
            String chosenTopping = InputHelper.getString("🥬: ");
            System.out.println("Would you like extra " + chosenTopping + "? (yes/no)");
            String extraToppingInput = InputHelper.getString("> ");
            boolean isExtraTopping = extraToppingInput.equalsIgnoreCase("yes");

            if (chosenTopping.equalsIgnoreCase("done")) {
                break;
            }

            List<String> sauces = List.of(
                    "Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Island", "Vinaigrette");
            System.out.println("🧂 Sauces");
            System.out.println("------------------------------------------------------------");
            sauces.forEach(sauce -> System.out.println("🧂 " + sauce));
            System.out.println("------------------------------------------------------------");
            String selectedSauce = InputHelper.getString("Enter a sauce (type 'none' to skip or enter one at a time): ");
            while (true) {
                System.out.println("Enter sauce:");
                String chosenSauce = InputHelper.getString("🧂: ");
                System.out.println("Would you like extra " + chosenSauce + "? (yes/no)");
                String extraSauceInput = InputHelper.getString("> ");
                boolean isExtraSauce = extraSauceInput.equalsIgnoreCase("yes");
                if (chosenSauce.equalsIgnoreCase("done")) {
                    break;
                }
            }
        }}
            public static void addDrink () {
            }
            public static void addChips () {
            }
            public static void checkout () {
                new CheckoutScreen();
            }
            public static void cancelOrder () {

            }
        }

