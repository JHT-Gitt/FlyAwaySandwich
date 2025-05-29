package com.pluralsight.helpers;

public class OrderHelper {
    public void addSandwich() {
        System.out.println("What type of Bread would you like?");
        System.out.println("");
        System.out.println("White, Wheat, Rye, or Wrap");
        InputHelper.getString("");
        System.out.println("What size would you like?");
        System.out.println("4\" 8\" 12\"");
        InputHelper.getString("");
        System.out.println("Choose a Protien");
        System.out.println("Steak, Ham, Salami, Roast Beef, Chicken, Bacon");
        InputHelper.getString("");

    }
    public void addDrink() {
    }
    public void addChips() {
    }
    public void checkout() {
    }
    public void cancelOrder() {

    }
}
