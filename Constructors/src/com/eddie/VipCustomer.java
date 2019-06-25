package com.eddie;

public class VipCustomer {

    private double creditLimit;
    private String name;
    private String emailAddress;

    public VipCustomer() {
        this(50000.00, "default name", "default email");

    }

    public VipCustomer(String name, String emailAddress) {
        this(50000.00,name,emailAddress);
    }

    public VipCustomer(double creditLimit, String name, String emailAddress) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
