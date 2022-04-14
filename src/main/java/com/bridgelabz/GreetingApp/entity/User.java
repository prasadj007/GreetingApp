package com.bridgelabz.GreetingApp.entity;

public class User {

    private String firstName;
    private String lastname;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
