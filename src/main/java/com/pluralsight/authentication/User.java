package com.pluralsight.authentication;

public class User {
    private String firstName;
    private String lastName;
    private boolean isGuest;

    public User(String firstName, String lastName, boolean isGuest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGuest = isGuest;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public boolean isGuest() { return isGuest; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGuest(boolean guest) { isGuest = guest; }

}

