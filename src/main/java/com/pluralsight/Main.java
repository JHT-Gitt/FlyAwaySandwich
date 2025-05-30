package com.pluralsight;

import com.pluralsight.helpers.InputHelper;
import com.pluralsight.ui.LoginScreen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select 1 ");
        System.out.println("1) Login Menu");
         int userChoice = InputHelper.getInt("> ");

        switch (userChoice) {
            case 1 -> {
                new LoginScreen();
            }
            default -> System.out.println("Invalid input");
        }
    }
}