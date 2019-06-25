package com.eddie;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    private static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contacts> contactList = new ArrayList<>();
    private String contactName;
    private String contactNumber;

    public Contacts() {
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public static void modifyContact(String searchName) {
        int position = -1;
        for(int i = 0; i < contactList.size(); i++) {
            if(searchName.equals(contactList.get(i).getContactName())) {
                position = i;
                break;
            }
        }
        if(position < 0) {
            System.out.println("No contact matches that name.");
            System.out.println();
        } else {
            Contacts tempContact = new Contacts();
            System.out.print("Enter new name: ");
            tempContact.setContactName(scanner.nextLine());
            System.out.print("Enter new number: ");
            tempContact.setContactNumber(scanner.nextLine());
            contactList.set(position, tempContact);
            System.out.println();
            System.out.println("Contact " + (position + 1) + " has been changed.");
            System.out.println("New contact name: " + contactList.get(position).getContactName());
            System.out.println("New contact number: " + contactList.get(position).getContactNumber());
            System.out.println();
        }
    }

    public static void printList() {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println("Contact " + (i+1) + ":");
            System.out.println("Name: " + contactList.get(i).getContactName());
            System.out.println("Number: " + contactList.get(i).getContactNumber());
            System.out.println();
        }
    }

    public static void removeContact(String searchName) {
        int position = -1;
        for(int i = 0; i < contactList.size(); i++) {
            if(searchName.equals(contactList.get(i).getContactName())) {
                position = i;
            }
        }
        if(position<0) {
            System.out.println("No contacts match that name.");
            System.out.println();
        } else {
            contactList.remove(position);
            System.out.println("Contact " + (position + 1) + " has been removed.");
            System.out.println();
        }
    }

    public static void searchForContact(String searchName) {
        int position = -1;
        for(int i = 0; i < contactList.size(); i++) {
            if(searchName.equals(contactList.get(i).getContactName())) {
                position = i;
            }
        }

        if(position<0) {
            System.out.println("No contacts match that name");
            System.out.println();
        } else {
            System.out.println("Contact " + (position+1) + " was a match.");
            System.out.println("Name: " + contactList.get(position).getContactName());
            System.out.println("Number: " + contactList.get(position).getContactNumber());
            System.out.println();
        }
    }

}
