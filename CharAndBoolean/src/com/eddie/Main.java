package com.eddie;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // char stores one character (special character, etc.)
        // char has a width of 16 (2 bytes).
        char myChar = 'D';

        // Unicode code for a copyright symbol
        char copyRight = '\u00A9';
        System.out.println(copyRight);

        // Boolean is for true/false, only accepts those two
        boolean myBoolean = false;
        boolean isMale = true;

        // Challenge
        char registeredSymbol = '\u00AE';

        System.out.println("Registered symbol = " + registeredSymbol);
    }
}
