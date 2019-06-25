package com.eddie;

public class hasSharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int numOneDigitOne = numberOne % 10;
        int numTwoDigitOne = numberTwo % 10;
        int numOneDigitTwo = (numberOne / 10) % 10;
        int numTwoDigitTwo = (numberTwo / 10) % 10;

        return (numOneDigitOne == numTwoDigitOne || numOneDigitOne == numTwoDigitTwo || numOneDigitTwo == numTwoDigitOne || numOneDigitTwo == numTwoDigitTwo);

    }

}
