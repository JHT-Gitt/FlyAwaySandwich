package com.pluralsight.authentication;

public class LoginManager {
    private String userName;
    private String password;

    public LoginManager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() { return userName; }
    public String getPassword() { return password; }

    public void setUserName(String userName) { this.userName = userName; }
    public void setPassword(String password) { this.password = password; }

    public boolean authenticate(String inputUserName, String inputPassword) {
        return this.userName.equalsIgnoreCase(inputUserName) &&
                this.password.equalsIgnoreCase(inputPassword);
    }
}
