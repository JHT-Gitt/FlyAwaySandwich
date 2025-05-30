package com.pluralsight.ui;

import com.pluralsight.authentication.LoginManager;
import com.pluralsight.authentication.User;
import com.pluralsight.helpers.InputHelper;

public class LoginScreen {

    public LoginScreen() {
        int userInput;
        User user = new User("", "", false);
        LoginManager login = new LoginManager("", "");

        System.out.println("Hello");
        System.out.println("Would you like to\n1) Create Acount\n2) Login\n3) Continue as Guest");
        userInput = InputHelper.getInt("");

        if (userInput == 1) {

            System.out.println("What is your fist name?");
            String firstName = InputHelper.getString("Enter First Name: ");
            System.out.println("what is your last name?");
            String lastName = InputHelper.getString("Enter Last Name: ");
            System.out.println("Create a User Name");
            String inputUserName = InputHelper.getString("Enter UserName: ");
            System.out.println("Create Password");
            String inputPassword = InputHelper.getString("Enter Password: ");
            user = new User(firstName, lastName, false);
            login = new LoginManager(inputUserName, inputPassword);
            new HomeScreen().greeting();
        } else if (userInput == 2) {

        String inputUserName = InputHelper.getString("Enter UserName: ");
            String inputPassword = InputHelper.getString("Enter Password: ");

            if (login.authenticate(inputUserName, inputPassword)) {
                System.out.println("Welcome Back, " + user.getFirstName());
                new HomeScreen().greeting();
            } else {
                System.out.println("Invalid credentials");
                System.out.println("Would you like to:\n 1) Try again\n2) Continue as Guest");
                InputHelper.getInt("");
                userInput = InputHelper.getInt("");

                if (userInput == 1) {
                    System.out.println(inputUserName);
                    System.out.println(inputPassword);
                    if (login.authenticate(inputUserName, inputPassword)) {
                        System.out.println("Welcome Back, " + user.getFirstName());
                        new HomeScreen().greeting();
                    } else {
                        System.out.println("Invalid credentials");
                    }

                }
            }

        } else if (userInput == 3) {
            HomeScreen.greeting();
        } else {
            System.out.println("Invalid option");
        }
    }
}
