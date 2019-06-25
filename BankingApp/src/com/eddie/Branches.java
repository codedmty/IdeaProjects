package com.eddie;

import java.util.ArrayList;
import java.util.Scanner;

public class Branches {

    private static Scanner scanner = new Scanner(System.in);

    private String branchName;
    public ArrayList<Customers> customers;

    public Branches(String branchName) {
        this.branchName = branchName;
        customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void printCustomerList() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + customers.get(i).getName());
        }
    }

    public void addCustomer() {
        System.out.println();
        System.out.print("-Enter the new customer name: ");
        String newName = scanner.nextLine();
        if (validateCustomer(newName)) {
            System.out.println();
            System.out.print("-Enter initial transaction amount: ");
            double transactionAmount = scanner.nextDouble();
            scanner.nextLine();
            Customers tempCustomer = new Customers(newName, transactionAmount);
            customers.add(tempCustomer);
            System.out.println();
            System.out.println("-Customer " + tempCustomer.getName() + " successfully added.");
        } else {
            System.out.println("-Customer already exists at branch.");
        }
    }

    public void addCustomerTransaction() {
        System.out.println();
        System.out.println("Please select the customer: ");
        printCustomerList();
        System.out.print("-Enter your selection: ");
        int custID = scanner.nextInt();
        System.out.println();
        System.out.print("-Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();
        customers.get(custID - 1).addTransaction(transactionAmount);
        if(transactionAmount < 0) {
            System.out.println("Withdrawal of " + transactionAmount + " registered.");
        } else if(transactionAmount > 0) {
            System.out.println("Deposit of " + transactionAmount + " registered.");
        } else {
            System.out.println("Transaction was registered but transaction amount was 0.");
        }
    }

    private boolean validateCustomer(String name) {
        boolean flag = true;
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
