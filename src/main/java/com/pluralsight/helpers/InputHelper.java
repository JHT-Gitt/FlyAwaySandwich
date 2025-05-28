package com.pluralsight.helpers;
import java.util.Scanner;

public class InputHelper {
    private static final Scanner asking = new Scanner(System.in);

    public static String getString(String userInput) {
        System.out.print(userInput);
        return asking.nextLine();
    }

    public static int getInt(String userInput) {
        System.out.print(userInput);
        while (!asking.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            asking.next(); // discard invalid input
        }
        int value = asking.nextInt();
        asking.nextLine(); // consume newline
        return value;
    }

    public static double getDouble(String userInput) {
        System.out.print(userInput);
        while (!asking.hasNextDouble()) {
            System.out.print("Please enter a valid decimal number: ");
            asking.next(); // discard invalid input
        }
        double value = asking.nextDouble();
        asking.nextLine(); // consume newline
        return value;
    }
}
