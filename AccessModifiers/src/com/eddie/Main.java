package com.eddie;

public class Main {

    public static void main(String[] args) {

        Account eddiesAccount = new Account("Eddie");

        eddiesAccount.deposit(1000);
        eddiesAccount.withdraw(500);
        eddiesAccount.withdraw(-200);
        eddiesAccount.deposit(-20);
        eddiesAccount.calculateBalance();
        eddiesAccount.balance = 5000;

        System.out.println("Balance on account is " + eddiesAccount.getBalance());
        eddiesAccount.transactions.add(4500);
        eddiesAccount.calculateBalance();

    }
}
