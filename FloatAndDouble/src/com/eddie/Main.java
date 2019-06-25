package com.eddie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 2;

        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 2f;

        // width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Challenge

        double lbsValue = 200d;
        double kgConversion = 0.45359237d;
        double lbsToKg = lbsValue * kgConversion;
        System.out.println(lbsValue + " pounds is equal to " + lbsToKg + (" kilograms."));
        // 90.7185 (Google)

        // Setting pi as a variable
        double pi = 3.1415927d;
    }
}
