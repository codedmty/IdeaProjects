package com.eddie;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Calling a constructor from another constructor
    public BankAccount() {
        this(4421,100,"default name","default email","default phone number");
        System.out.println("Empty constructor called");
    }

    //Constructor assigning input to the Class variables
    //No setters in constructors, use this.field
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //defaulting two values and accepting the rest as input
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int accountNumber, double depositAmount) {
        if (accountNumber != getAccountNumber()) {
            System.out.println("Invalid account number, please try again.");
        } else {
            this.balance += depositAmount;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

    public void withdrawFunds(int accountNumber, double withdrawAmount) {
        if(accountNumber != getAccountNumber()) {
            System.out.println("Invalid account number, please try again.");
        } else if(getBalance() - withdrawAmount < 0) {
            System.out.println("Insufficient funds, your current balance is: " + getBalance());
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

}
