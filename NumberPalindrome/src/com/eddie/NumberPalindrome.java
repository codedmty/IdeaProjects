package com.eddie;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int origNum = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }

        return (origNum == reverse);

    }

}
