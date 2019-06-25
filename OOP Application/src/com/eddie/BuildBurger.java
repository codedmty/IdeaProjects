package com.eddie;

import java.util.Scanner;

public class BuildBurger {

    public static Hamburger BurgerBuilder() {

        // Initialize the hamburger and the scanner
        Hamburger hamburger = null;
        Scanner scanner = new Scanner(System.in);

        // Asking customer for their choice, validating the input, and selecting which Class to use
        for (int i = 0; i < 1; ) {
            System.out.println("*           Which burger would you like?            *");
            System.out.println("*           -Select 1 for the Basic Burger          *");
            System.out.println("*           -Select 2 for the Healthy Burger        *");
            System.out.println("*           -Select 3 for the Burger Combo          *");
            System.out.println("*****************************************************");
            System.out.println();
            System.out.print("  Enter your selection here: ");
            boolean hasNextInt = scanner.hasNextInt();
            System.out.println();
            System.out.println("*****************************************************");
            if (!hasNextInt) {
                System.out.println("That is not a valid selection");
            } else {
                switch (scanner.nextInt()) {
                    case 1:
                        hamburger = new Hamburger();
                        i++;
                        break;
                    case 2:
                        hamburger = new HealthyBurger();
                        i++;
                        break;
                    case 3:
                        hamburger = new BurgerCombo();
                        i++;
                        break;
                    default:
                        System.out.println("That is not a valid selection.");
                        System.out.println("Please try another choice.");
                        System.out.println();
                }
            }
        }

        scanner.nextLine();

        // Adding the extras
        if (hamburger.getName() == "Basic Burger" || hamburger.getName() == "Healthy Burger") {
            System.out.println("*           Would you like to add extras?           *");
            System.out.println("*           -Select 1 for yes or 2 for no           *");
            System.out.println("*****************************************************");
            System.out.println();
            System.out.print("  Enter your selection here: ");
            boolean hasNextInt = scanner.hasNextInt();
            System.out.println();
            if (hasNextInt) {

                // If customer chooses to add extras to their burger
                if (scanner.nextInt() == 1) {

                    // Adding extra1
                    System.out.println("*****************************************************");
                    System.out.println("*    Would you like to add tomato for 0.30 more?    *");
                    System.out.println("*         -Select 1 for yes, or 2 for no.           *");
                    System.out.println("*****************************************************");
                    System.out.println();
                    System.out.print("  Enter your selection here: ");
                    int i = scanner.nextInt();
                    if (i == 1) {
                        hamburger.setExtra1("tomatoes");
                        hamburger.setPrice(0.30);
                    } else {
                        hamburger.setExtra1("");
                    }

                    // Adding extra2
                    System.out.println();
                    System.out.println("*****************************************************");
                    System.out.println("*     Would you like to add onion for 0.25 more?    *");
                    System.out.println("*         -Select 1 for yes, or 2 for no.           *");
                    System.out.println("*****************************************************");
                    System.out.println();
                    System.out.print("  Enter your selection here: ");
                    i = scanner.nextInt();
                    if (i == 1) {
                        hamburger.setExtra2("onions");
                        hamburger.setPrice(0.25);
                    } else {
                        hamburger.setExtra2("");
                    }

                    // Adding extra3
                    System.out.println();
                    System.out.println("*****************************************************");
                    System.out.println("*    Would you like to add cheese for 0.50 more?    *");
                    System.out.println("*         -Select 1 for yes, or 2 for no.           *");
                    System.out.println("*****************************************************");
                    System.out.println();
                    System.out.print("  Enter your selection here: ");
                    i = scanner.nextInt();
                    if (i == 1) {
                        hamburger.setExtra3("cheddar cheese");
                        hamburger.setPrice(0.50);
                    } else {
                        hamburger.setExtra3("");
                    }

                    // Adding extra4
                    System.out.println();
                    System.out.println("*****************************************************");
                    System.out.println("*    Would you like to add bacon for 0.75 more?     *");
                    System.out.println("*         - Select 1 for yes, or 2 for no.          *");
                    System.out.println("*****************************************************");
                    System.out.println();
                    System.out.print("  Enter your selection here: ");
                    i = scanner.nextInt();
                    if (i == 1) {
                        hamburger.setExtra4("bacon");
                        hamburger.setPrice(0.75);
                    } else {
                        hamburger.setExtra4("");
                    }

                    // Only adding extra5 & extra6 it is a HealthyBurger()
                    if(hamburger.getName() == "Healthy Burger") {
                        System.out.println();
                        System.out.println("*****************************************************");
                        System.out.println("*   Would you like to add avocado for 1.00 more?    *");
                        System.out.println("*         -Select 1 for yes, or 2 for no.           *");
                        System.out.println("*****************************************************");
                        System.out.println();
                        System.out.print("  Enter your selection here: ");
                        i = scanner.nextInt();
                        if (i == 1) {
                            hamburger.setExtra5("avocado");
                            hamburger.setPrice(1.00);
                        } else {
                            hamburger.setExtra5("");
                        }

                        System.out.println();
                        System.out.println("*****************************************************");
                        System.out.println("* Would you like to add extra greens for 0.80 more? *");
                        System.out.println("*         -Select 1 for yes, or 2 for no.           *");
                        System.out.println("*****************************************************");
                        System.out.println();
                        System.out.print("  Enter your selection here: ");
                        i = scanner.nextInt();
                        if (i == 1) {
                            hamburger.setExtra6("extra greens");
                            hamburger.setPrice(0.80);
                        } else {
                            hamburger.setExtra6("");
                        }
                    }

                }
            }
        }

        scanner.close();
        return hamburger;

    }
}


