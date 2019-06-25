package com.eddie;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;
        int input;

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                input = scanner.nextInt();
                sum += input;
                count++;
                average = (double) sum / count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
    }

}
