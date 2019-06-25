package com.eddie;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            int rowCount = 1;
            int columnCount = 1;
            while (rowCount <= number) {
                for (int i = 1; i <= number; i++) {
                    if (rowCount == 1 || rowCount == number) {
                        System.out.print("*");
                        columnCount++;
                    } else if (columnCount == 1 || columnCount == number) {
                        System.out.print("*");
                        columnCount++;
                    } else if (rowCount == columnCount) {
                        System.out.print("*");
                        columnCount++;
                    } else if (columnCount == number - rowCount + 1) {
                        System.out.print("*");
                        columnCount++;
                    } else {
                        System.out.print(" ");
                        columnCount++;
                    }
                }
                System.out.println();
                columnCount = 1;
                rowCount++;
            }
        }
    }
}
