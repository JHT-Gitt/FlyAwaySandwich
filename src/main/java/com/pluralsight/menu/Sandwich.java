package com.pluralsight.menu;

import com.pluralsight.helpers.OrderHelper;
import com.pluralsight.ingredients.Topping;
import com.pluralsight.interfaces.Priceable;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Sandwich<T extends Priceable> {



    private String breadType;
    private int breadSize;
    private boolean isToasted;
    private ArrayList<T> topppings;
    private boolean isExtraMeat;
    private boolean isExtraCheese;


//    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(int breadSize) {
        this.breadSize = breadSize;
        this.topppings = new ArrayList<>();
    }

    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setBreadSize(int breadSize) {
        this.breadSize = breadSize;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addTopping(T topping){
        topppings.add(topping);
    }
    public double getBreadPrice() {
        return switch (breadSize) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0;
        };
    }

    public double getExtraMeat(){
        return switch (breadSize){
            case 4 -> .50;
            case 8 -> 1.00;
            case 12 -> 1.50;
            default -> 0;
        };
    }
        public double getExtraCheese() {
            return switch (breadSize) {
                case 4 -> .30;
                case 8 -> .60;
                case 12 -> .90;
                default -> 0;
            };
        }
    public double totalPrice(){
        double total = getBreadPrice() ;

        if(isExtraMeat){
            total += getExtraMeat();
        }
        if(isExtraCheese){
            total += getExtraCheese();
        }
        for(T top : topppings){
            total += top.totalPrice(breadSize);
        }
        return total;
    }
    public String getReceipt() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nCurrent Order\n");
        sb.append("Bread Type: ").append(breadType).append("\n");
        sb.append("Size: ").append(breadSize).append("\" - $")
                .append(String.format("%.2f", getBreadPrice())).append("\n");
        sb.append("Toasted: ").append(isToasted).append("\n");

        for(T t : topppings){
            double price = t.totalPrice(breadSize);
            if( price == 0){
                sb.append(" - ").append(t.name()).append("\n");
            }else {
                sb.append(" - ").append(t.name()).append(" : $").append(String.format("%.2f", price)).append("\n");
            }
        }
        sb.append("Extra Meat: $").append(isExtraMeat ? getExtraMeat() : 0.00 ).append("\n");
        sb.append("Extra Cheese: $").append(isExtraCheese ? getExtraCheese() : 0.00 ).append("\n");
        sb.append("\nSandwich Total: $").append(String.format("%.2f", totalPrice())).append("\n");
        sb.append("--------------------------\n");

        return sb.toString();
    }
    //    public Sandwich(String breadType, int breadSize, double basePrice, boolean isToasted, List<Topping> toppings) {
//        this.breadType = breadType;
//        this.breadSize = breadSize;
//        this.basePrice = getBreadPrice();
//        this.isToasted = isToasted;
//        this.toppings = toppings;



//    public Sandwich() {
//
//    }

//    public Sandwich(String selectedSize, String selectedBreadType) {
//    }

//    public void setBreadType(String breadType) {
//        this.breadType = breadType;
//    }
//
//    public double getBasePrice() {
//        return basePrice;
//    }
//
//    public void setBasePrice(double basePrice) {
//        this.basePrice = basePrice;
//    }
//
//    public void setBreadSize(int breadSize) {
//        this.breadSize = breadSize;
//    }
//
//    public String getBreadType() {
//        return breadType;
//    }
//    public int getBreadSize() {
//        return breadSize;
//    }
//    public boolean isToasted() {
//        return isToasted;
//    }
//    public List<Topping> getToppings() {
//        return toppings; }
//
//    public void setToasted(boolean toasted) {
//        isToasted = toasted; }
//    public void setToppings(List<Topping> toppings) {
//        this.toppings = toppings; }


//    private double getToppingPriceByCategory(String category) {
//       return toppings.stream()
//                .filter(t -> t.getType().equalsIgnoreCase(category))
//                .mapToDouble(t -> t.isExtra()
//                        ? t.getBasePrice() * .5 : t.getBasePrice())
//                .sum();//returns the result directly
//    }

//    @Override
//    public double totalPrice() {
//        double total = getBreadPrice();
//
//        total += getToppingPriceByCategory("meat");
//        total += getToppingPriceByCategory("cheese");
//        total += getToppingPriceByCategory("regular");
//        total += getToppingPriceByCategory("sauce");
//
//        return total;
//    }
//    @Override
//    public String toString() {
//        return breadSize + "\" " + (isToasted ? "Toasted" : "Not Toasted") + " " + breadType + " Sandwich with " + toppings.size() + " toppings. $" + totalPrice();
//}

//    public void addTopping(Topping topping) {
//        toppings.add(topping);
//    }
}