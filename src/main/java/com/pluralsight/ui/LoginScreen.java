package com.pluralsight.ui;

import com.pluralsight.authentication.LoginManager;
import com.pluralsight.authentication.User;
import com.pluralsight.helpers.InputHelper;

public class LoginScreen {

    public LoginScreen() {
        User user = new User("", "", false);
        LoginManager login = new LoginManager("", "");
        String inputUserName = InputHelper.getString("Enter UserName: ");
        String inputPassword = InputHelper.getString("Enter Password: ");

        if (login.authenticate(inputUserName, inputPassword)) {
            System.out.println("Welcome Back, " + user.getFirstName());
        } else {
            System.out.println("Invalid credentials");
            System.out.println("Would you like to:\n 1) Try again\n2) Continue as Guest");
            InputHelper.getInt("");
            int userInput = InputHelper.getInt("");

            if (userInput == 1) {
                System.out.println(inputUserName);
                System.out.println(inputPassword);
                if (login.authenticate(inputUserName, inputPassword)) {
                    System.out.println("Welcome Back, " + user.getFirstName());
                } else {
                    System.out.println("Invalid credentials");
                }
                if (userInput == 2) {
                    HomeScreen.greeting();
                }

            }
        }
    }}
