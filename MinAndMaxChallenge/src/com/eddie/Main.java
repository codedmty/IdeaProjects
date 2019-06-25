package com.eddie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0; // Integer.MAX_VALUE
        int max = 0; // INTEGER.MIN_VALUE
        int userInput;
        boolean hasNextInt;
        int count = 1;

        while (true) {

            System.out.println("Enter number:");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                userInput = scanner.nextInt();

                if (count == 1) {
                    min = userInput;
                    max = userInput;
                    count++;

                } else {

                    if (userInput > max) {
                        max = userInput;
                        count++;
                    } else if (userInput < min) {
                        min = userInput;
                        count++;
                    } else {
                        count++;
                    }

                }

                scanner.nextLine();

            } else {

                System.out.println("Invalid Value");
                break;

            }
        }

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
        scanner.close();

    }
}
