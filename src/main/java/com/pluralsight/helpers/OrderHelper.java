package com.pluralsight.helpers;

import com.pluralsight.ingredients.Cheese;
import com.pluralsight.ingredients.Meat;
import com.pluralsight.ingredients.Topping;
import com.pluralsight.ingredients.Toppings;
import com.pluralsight.interfaces.Priceable;
import com.pluralsight.menu.Chips;
import com.pluralsight.menu.Drinks;
import com.pluralsight.menu.Order;
import com.pluralsight.menu.Sandwich;
import com.pluralsight.ui.CheckoutScreen;
import com.pluralsight.ui.HomeScreen;
import com.pluralsight.ui.OrderScreen;

import java.util.ArrayList;
import java.util.List;

public class OrderHelper {
    double price;
    private static Order currentOrder = new Order();
    HomeScreen o = new HomeScreen();
    static double totalExtra = 0;

    List<Sandwich<Priceable>> sandwichOrders = new ArrayList<>();
  //  List<Sandwich> sandwich =  new ArrayList<>();
    int size;
    public void addSandwich() {
        Sandwich<Priceable> sandwich = new Sandwich<>(size);

        List<String> sizes = List.of("4", "8", "12");
        System.out.println("📏 What size sandwich would you like?");
        System.out.println("------------------------------------------------------------");
        sizes.forEach(size -> System.out.println("- " + size + "\""));
        System.out.println("------------------------------------------------------------");
        int selectedSize = InputHelper.getInt("Enter your sandwich size (just the number, like 4, 8, or 12): ");
        sandwich.setBreadSize(selectedSize);

        List<String> breadTypes = List.of("White", "Wheat", "Rye", "Wrap");
        System.out.println("What type of bread would you like?");
        System.out.println("------------------------------------------------------------");
        breadTypes.forEach(breadType -> System.out.println("-" + breadType));
        System.out.println("------------------------------------------------------------");
        String selectedBreadType = InputHelper.getString("Enter your bread type: ");
        sandwich.setBreadType(selectedBreadType);
        System.out.println("You chose a " + selectedSize + "\" " + selectedBreadType + " bread");

        System.out.println("Base price: $" + sandwich.getBreadPrice());

        List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");
        System.out.println("\n🥩 Choose a Protein");
        System.out.println("------------------------------------------------------------");
        meats.forEach(meat -> System.out.println("🥩 " + meat));
        System.out.println("------------------------------------------------------------");
        String selectedMeat = InputHelper.getString("Enter your protein: ");
        sandwich.addTopping(new Meat(selectedMeat));

        System.out.println("Would you like extra " + selectedMeat + "? (yes/no)");
        String extraMeat = InputHelper.getString("> ");

        if(extraMeat.equals("yes")){
           // String extra = "Extra " + selectedMeat;
            sandwich.setExtraMeat(true);
        }

       // boolean isExtraMeat = extraMeat.equalsIgnoreCase("yes");

        System.out.println("You chose " + selectedMeat + " as your protein");



        List<String> cheeses = List.of("American", "Provolone", "Cheddar", "Swiss");
        System.out.println("🧀 Choose your Cheese:");
        System.out.println("------------------------------------------------------------");
        cheeses.forEach(cheese -> System.out.println("🧀 " + cheese));
        System.out.println("------------------------------------------------------------");
        String selectedCheese = InputHelper.getString("Enter your cheese: ");
        sandwich.addTopping(new Cheese(selectedCheese));

        System.out.println("Would you like extra " + selectedCheese + "? (yes/no)");
        String extraCheese = InputHelper.getString("> ");

        if(extraCheese.equals("yes")){
           sandwich.setExtraCheese(true);
        }
        //boolean isExtraCheese = extraCheese.equalsIgnoreCase("yes");
        System.out.println("Would you like it toasted ? (yes/no)");
        String toasted = InputHelper.getString("> ");
        boolean isToasted = toasted.equalsIgnoreCase("yes");
        sandwich.setToasted(isToasted);
     //   Topping cheeseTopping = new Topping(selectedCheese, "cheese", isExtraCheese);
      //  sandwich.addTopping(cheeseTopping);

        List<String> selectedToppings = new ArrayList<>();
        List<String> regularToppings = List.of(
                "Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapeños", "Cucumbers",
                "Pickles", "Guacamole", "Mushrooms");
        System.out.println("🥬 Regular Toppings");
        System.out.println("------------------------------------------------------------");
        regularToppings.forEach(topping -> System.out.println("🥬 " + topping));
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter a topping (type 'done' to skip or enter one at a time): ");
        while (true) {
            String chosenTopping = InputHelper.getString("🥬: ");
            if (chosenTopping.equalsIgnoreCase("done")) break;

            selectedToppings.add(chosenTopping);

//            System.out.println("Would you like extra " + chosenTopping + "? (yes/no)");
//            boolean isExtraTopping = InputHelper.getString("> ").equalsIgnoreCase("yes");
        //    Topping regularTopping = new Topping(chosenTopping, "regular", isExtraTopping);

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

            selectedToppings.add(chosenSauce);

//
//            System.out.println("Would you like extra " + chosenSauce + "? (yes/no)");
//            boolean isExtraSauce = InputHelper.getString("> ").equalsIgnoreCase("yes");
//            Topping sauceTopping = new Topping(chosenSauce, "sauce", isExtraSauce);

        }
        for(String s : selectedToppings){
            sandwich.addTopping(new Toppings(s));
        }
        sandwichOrders.add(sandwich);
        System.out.println("\nSandwich Order Added");
    }

//            public static void addDrink() {
//                List<String> drinkOptions = List.of("Coke", "Sprite", "Lemonade", "Water");
//                System.out.println("🥤 Choose a Drink:");
//                drinkOptions.forEach(drink -> System.out.println("🥤 " + drink));
//                String selectedDrink = InputHelper.getString("Enter your drink choice: ");
//                List<String> drinkSizes = List.of("Small", "Medium", "Large");
//                System.out.println("📏 Choose a Size:");
//                System.out.println("------------------------------------------------------------");
//                drinkSizes.forEach(size -> System.out.println("- " + size));
//                String selectedSize = InputHelper.getString("Enter your drink size: ");
//                System.out.println("You chose: " + selectedSize + " " + selectedDrink);
//
//                Drinks drink = new Drinks(selectedDrink, selectedSize, price, true);
//                Order.addDrinks(drink);
//
//            }

//            public static void addChips () {
//                List<String> chipOptions = List.of("BBQ", "Salt & Vinegar", "Plain", "Doritos", "Cheetos");
//                System.out.println("🥔 Choose a Chip:");
//                chipOptions.forEach(chip -> System.out.println("🥔 " + chip));
//                String selectedChip = InputHelper.getString("Enter your chip choice: ");
//                System.out.println("You picked: " + selectedChip);
//                Chips chips = new Chips(selectedChip, price);
//                Order.addChip(chips);
//            }
//    public static double total(){
//        return totalExtra;
//    }
public void printReceipt() {

        int counter = 1;
    double sandwichesTotal = 0;
    StringBuilder receipt = new StringBuilder("--- FULL ORDER RECEIPT ---\n");

    for (Sandwich<Priceable> s : sandwichOrders) {
        receipt.append("\nSandwich: ").append(counter++).append("\n");
        receipt.append(s.getReceipt());
        sandwichesTotal += s.totalPrice();
    }


    receipt.append(String.format("Grand Total: $%.2f\n", sandwichesTotal));  // Proper formatting
    System.out.println(receipt);
    //totalExtra = 0;
}


public String check(){
        double grandTotal= 0;
            StringBuilder receipt = new StringBuilder("--- FULL ORDER RECEIPT ---\n");

    int counter = 1;
    double sandwichesTotal = 0;


    for (Sandwich<Priceable> s : sandwichOrders) {
        receipt.append("\nSandwich: ").append(counter++).append("\n");
        receipt.append(s.getReceipt());
        sandwichesTotal += s.totalPrice();
    }


    receipt.append(String.format("Grand Total: $%.2f\n", sandwichesTotal));  // Proper formatting

            return receipt.toString();
    }




        public void checkout () {
                System.out.println(currentOrder.buildReceipt());
                CheckoutScreen.display();
            }

            public void cancelOrder () {
                sandwichOrders.clear();

               // System.out.println("\nOrder Canceled\n");
                o.greeting();
            }
        }

