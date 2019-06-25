package com.eddie;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            int i;
            int foundFactor = 1;

            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    foundFactor = i;
                    number = number / i;
                    i--;
                }
            }
            return foundFactor;
        }
    }
}