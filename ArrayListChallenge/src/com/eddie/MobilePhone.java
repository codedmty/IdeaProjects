package com.eddie;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);

    public static void initialize() {
        System.out.println("Hello....");
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    Contacts.printList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Goodbye.");
                    scanner.close();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to your phone.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact from your phone.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To turn off your phone.");
    }

    public static void addContact() {
        Contacts tempContact = new Contacts();
        System.out.print("Enter contact name: ");
        tempContact.setContactName(scanner.nextLine());
        System.out.print("Enter contact number: ");
        tempContact.setContactNumber(scanner.nextLine());
        Contacts.contactList.add(tempContact);
        System.out.println("Contact saved to your phone.");
        System.out.println();
    }

    public static void modifyContact() {
        System.out.print("Enter contact to modify: ");
        String searchName = scanner.nextLine();
        Contacts.modifyContact(searchName);
    }

    public static void removeContact() {
        System.out.print("Enter contact to delete: ");
        String searchName = scanner.nextLine();
        Contacts.removeContact(searchName);

    }

    public static void searchForContact() {
        System.out.print("Enter contact to search for: ");
        String searchName = scanner.nextLine();
        Contacts.searchForContact(searchName);
    }

}
