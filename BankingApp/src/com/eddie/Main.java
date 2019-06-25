package com.eddie;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static Bank bank = new Bank("App Credit Union");

    public static void main(String[] args) {

        welcome();

        boolean flag = true;

        while(flag) {
            System.out.print("Enter your selection (1 for options): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    bank.addBranch();
                    break;
                case 3:
                    bank.printBranchList();
                    break;
                case 4:
                    bank.addBranchCustomer();
                    break;
                case 5:
                    bank.addBranchCustTransaction();
                    break;
                case 6:
                    bank.printBranchCustomerList();
                    break;
                case 7:
                    bank.printCustTransactions();
                    break;
                case 8:
                    flag = false;
                    System.out.println("Goodbye...");
                    scanner.close();
                    break;
            }
        }

    }

    public static void welcome() {
        System.out.println();
        System.out.println("Welcome to " + bank.getBankName());
        printInstructions();
    }

    private static void printInstructions() {
        System.out.println("\n What would you like to do?");
        System.out.println("\t 1. Print options");
        System.out.println("\t 2. Add a branch");
        System.out.println("\t 3. Print branch list");
        System.out.println("\t 4. Add new customer");
        System.out.println("\t 5. Add customer transaction");
        System.out.println("\t 6. Print branch customer list");
        System.out.println("\t 7. Print customer transaction history");
        System.out.println("\t 8. Exit the program");
        System.out.println();
    }

}
