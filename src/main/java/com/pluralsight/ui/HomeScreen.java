package com.pluralsight.ui;

import com.pluralsight.helpers.InputHelper;

import java.util.Scanner;

public class HomeScreen {

    public static void greeting() {
        System.out.println("Welcome to Fly Away Sandwich");
        System.out.println("Where every bite makes you feel like your flying the skies");

        System.out.println("Would you like 1) New  order or 0) Exit");
        int choice = InputHelper.getInt("");
        switch (choice){
            case 1 -> {
                System.out.println("What can I get you?");
                 new OrderScreen().display();
            }
            case 0 -> System.out.println("⚠️You are Exiting⚠️");
            default -> throw new IllegalStateException("Unexpected value: " + InputHelper.getInt(""));
        }
    }
}
