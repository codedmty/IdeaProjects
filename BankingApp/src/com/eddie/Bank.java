package com.eddie;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static Scanner scanner = new Scanner(System.in);

    private String bankName;
    private ArrayList<Branches> branchesArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        branchesArrayList = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addBranch() {
        System.out.print("\n-Enter Branch Name: ");
        String branchName = scanner.nextLine();
        if(validateBranch(branchName)) {
            Branches tempBranch = new Branches(branchName);
            branchesArrayList.add(tempBranch);
            System.out.println("\n-Branch " + tempBranch.getBranchName() + " added successfully.");
            System.out.println();
        } else {
            System.out.println("\n-Branch already exists. Please try again.");
            System.out.println();
        }
    }

    public void addBranchCustomer() {
        int b = chooseBranch();
        System.out.println();
        System.out.println("You are currently making changes to the " + branchesArrayList.get(b).getBranchName() + " branch.");
        branchesArrayList.get(b).addCustomer();
    }

    public void addBranchCustTransaction() {
        int b = chooseBranch();
        System.out.println();
        System.out.println("You are currently making changes to the " + branchesArrayList.get(b).getBranchName() + " branch.");
        branchesArrayList.get(b).addCustomerTransaction();
    }

    public void printBranchCustomerList() {
        int b = chooseBranch();
        System.out.println(branchesArrayList.get(b).getBranchName() + " customer list:");
        branchesArrayList.get(b).printCustomerList();
    }

    public void printCustTransactions() {
        int b = chooseBranch();
        System.out.println("Choose customer: ");
        branchesArrayList.get(b).printCustomerList();
        System.out.print("Enter your selection: ");
        int c = scanner.nextInt();
        c--;
        scanner.nextLine();
        for(int i = 0; i < branchesArrayList.get(b).customers.get(c).transactionList.size(); i++) {
            System.out.println(branchesArrayList.get(b).customers.get(c).transactionList.get(i));
        }
    }

    public void printBranchList() {
        System.out.println();
        System.out.println(this.bankName + " Branches:");
        System.out.println();
        for(int i = 0; i<branchesArrayList.size(); i++) {
            System.out.println("\t" + (i+1) + ". " + branchesArrayList.get(i).getBranchName());
        }
        System.out.println();
    }

    private boolean validateBranch(String name) {
        boolean flag = true;

        for(int i = 0; i < branchesArrayList.size(); i++) {
            if(name.equals(branchesArrayList.get(i).getBranchName())) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private int chooseBranch() {
        System.out.println();
        System.out.println("Choose branch to switch to: ");
        for(int i = 0; i < branchesArrayList.size(); i++) {
            System.out.println("\t" + (i+1) + ". " + branchesArrayList.get(i).getBranchName());
        }
        System.out.println();
        System.out.print("Enter your selection: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        b--;
        return b;
    }

}
