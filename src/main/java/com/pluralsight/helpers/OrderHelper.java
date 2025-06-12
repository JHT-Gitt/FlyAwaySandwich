package com.pluralsight.helpers;

import com.pluralsight.ingredients.Topping;
import com.pluralsight.menu.Chips;
import com.pluralsight.menu.Drinks;
import com.pluralsight.menu.Order;
import com.pluralsight.menu.Sandwich;
import com.pluralsight.ui.CheckoutScreen;

import java.util.List;

public class OrderHelper {
    private static Order currentOrder = new Order();
    public static void addSandwich() {
        List<String> sizes = List.of("4", "8", "12");
        System.out.println("📏 What size sandwich would you like?");
        System.out.println("------------------------------------------------------------");
        sizes.forEach(size -> System.out.println("- " + size + "\""));
        System.out.println("------------------------------------------------------------");
        String selectedSize = InputHelper.getString("Enter your sandwich size (just the number, like 4, 8, or 12): ");


        List<String> breadTypes = List.of("White", "Wheat", "Rye", "Wrap");
        System.out.println("What type of bread would you like?");
        System.out.println("------------------------------------------------------------");
        breadTypes.forEach(breadType -> System.out.println("-" + breadType));
        System.out.println("------------------------------------------------------------");
        String selectedBreadType = InputHelper.getString("Enter your bread type: ");
        System.out.println("You chose a " + selectedSize + "\"" + selectedBreadType + " bread");
        Sandwich sandwich = new Sandwich(selectedSize, selectedBreadType);
        System.out.println("Base price: $" + Sandwich.getBreadPrice());

        List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");
        System.out.println("🥩 Choose a Protein");
        System.out.println("------------------------------------------------------------");
        meats.forEach(meat -> System.out.println("🥩 " + meat));
        System.out.println("------------------------------------------------------------");
        String selectedMeat = InputHelper.getString("Enter your protein: ");
        System.out.println("Would you like extra " + selectedMeat + "? (yes/no)");
        String extraMeat = InputHelper.getString("> ");
        boolean isExtraMeat = extraMeat.equalsIgnoreCase("yes");
        System.out.println("You chose " + selectedMeat + " as your protein");
        Topping meatTopping = new Topping(selectedMeat, "meat", isExtraMeat);
        sandwich.addTopping(meatTopping);

        List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");
        System.out.println("🧀 Choose your Cheese:");
        System.out.println("------------------------------------------------------------");
        cheeses.forEach(cheese -> System.out.println("🧀 " + cheese));
        System.out.println("------------------------------------------------------------");
        String selectedCheese = InputHelper.getString("Enter your cheese: ");
        System.out.println("Would you like extra " + selectedCheese + "? (yes/no)");
        String extraCheese = InputHelper.getString("> ");
        boolean isExtraCheese = extraCheese.equalsIgnoreCase("yes");
        System.out.println("Would you like it toasted ? (yes/no)");
        String toasted = InputHelper.getString("> ");
        boolean isToasted = toasted.equalsIgnoreCase("yes");
        Topping cheeseTopping = new Topping(selectedCheese, "cheese", isExtraCheese);
        sandwich.addTopping(cheeseTopping);

        List<String> regularToppings = List.of(
                "Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapeños", "Cucumbers",
                "Pickles", "Guacamole", "Mushrooms");
        System.out.println("🥬 Regular Toppings");
        System.out.println("------------------------------------------------------------");
        regularToppings.forEach(topping -> System.out.println("🥬 " + topping));
        System.out.println("------------------------------------------------------------");
        String selectedTopping = InputHelper.getString("Enter a topping (type 'done' to skip or enter one at a time): ");
        while (true) {
            String chosenTopping = InputHelper.getString("🥬: ");
            if (chosenTopping.equalsIgnoreCase("done")) break;

            System.out.println("Would you like extra " + chosenTopping + "? (yes/no)");
            boolean isExtraTopping = InputHelper.getString("> ").equalsIgnoreCase("yes");
            Topping regularTopping = new Topping(chosenTopping, "regular", isExtraTopping);
            sandwich.addTopping(regularTopping);
        }
        List<String> sauces = List.of(
                "Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Island", "Vinaigrette");

        System.out.println("🧂 Sauces");
        System.out.println("------------------------------------------------------------");
        sauces.forEach(sauce -> System.out.println("🧂 " + sauce));
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter sauces one at a time. Type 'done' when finished.");

        while (true) {
            String chosenSauce = InputHelper.getString("🧂: ");
            if (chosenSauce.equalsIgnoreCase("done")) break;

            System.out.println("Would you like extra " + chosenSauce + "? (yes/no)");
            boolean isExtraSauce = InputHelper.getString("> ").equalsIgnoreCase("yes");
            Topping sauceTopping = new Topping(chosenSauce, "sauce", isExtraSauce);
            sandwich.addTopping(sauceTopping);
        }
    }
            public static void addDrink() {
                List<String> drinkOptions = List.of("Coke", "Sprite", "Lemonade", "Water");
                System.out.println("🥤 Choose a Drink:");
                drinkOptions.forEach(drink -> System.out.println("🥤 " + drink));
                String selectedDrink = InputHelper.getString("Enter your drink choice: ");
                List<String> drinkSizes = List.of("Small", "Medium", "Large");
                System.out.println("📏 Choose a Size:");
                System.out.println("------------------------------------------------------------");
                drinkSizes.forEach(size -> System.out.println("- " + size));
                String selectedSize = InputHelper.getString("Enter your drink size: ");
                System.out.println("You chose: " + selectedSize + " " + selectedDrink);
                Drinks drink = new Drinks(selectedDrink, selectedSize, price, true);
                Order.addDrinks(drink);

            }

            public static void addChips () {
                List<String> chipOptions = List.of("BBQ", "Salt & Vinegar", "Plain", "Doritos", "Cheetos");
                System.out.println("🥔 Choose a Chip:");
                chipOptions.forEach(chip -> System.out.println("🥔 " + chip));
                String selectedChip = InputHelper.getString("Enter your chip choice: ");
                System.out.println("You picked: " + selectedChip);
                Chips chips = new Chips(selectedChip, price);
                Order.addChip(chips);
            }
            public static void checkout () {
                System.out.println(currentOrder.buildReceipt());
                CheckoutScreen.display();
            }
            public static void cancelOrder () {
                System.out.println("Order canceled");
            }
        }

