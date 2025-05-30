package com.pluralsight.menu;

import java.util.ArrayList;
import java.util.List;
public class Order {private List<Sandwich> sandwiches = new ArrayList<>();
    private List<String> drinks = new ArrayList<>();
    private List<String> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(String drink) {
        drinks.add(drink);
    }

    public void addChips(String chip) {
        chips.add(chip);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public List<String> getChips() {
        return chips;
    }

    public double getTotal() {
        return sandwiches.stream().mapToDouble(Sandwich::totalPrice).sum() + (drinks.size() * 2.50) + (chips.size() * 1.50);
    }

    public String buildReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("🧾 DELI-cious Receipt 🧾\n");
        receipt.append("====================================\n");

        int i = 1;
        for (Sandwich sandwich : sandwiches) {
            receipt.append("🥪 Sandwich #" + i++ + ": " + sandwich.toString() + "\n");
        }

        if (!drinks.isEmpty()) {
            receipt.append("🥤 Drinks:\n");
            drinks.forEach(drink -> receipt.append(" - " + drink + "\n"));
        }

        if (!chips.isEmpty()) {
            receipt.append("🥔 Chips:\n");
            chips.forEach(chip -> receipt.append(" - " + chip + "\n"));
        }

        receipt.append("====================================\n");
        receipt.append("💰 Total: $" + String.format("%.2f", getTotal()) + "\n");

        return receipt.toString();
    }
}

