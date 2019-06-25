package com.eddie;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Array Length: ");
        int consoleCount = scanner.nextInt();
        scanner.nextLine();
        int[] mainArray = readIntegers(consoleCount);
        System.out.println("The minimum value of the array is " + findMin(mainArray));
        scanner.close();

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            System.out.println("Enter value for array position " + i);
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
