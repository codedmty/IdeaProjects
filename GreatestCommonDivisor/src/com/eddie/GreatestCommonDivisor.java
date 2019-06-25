package com.eddie;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int numOne, int numTwo) {

        if(numOne < 10 || numTwo < 10) {
            return -1;
        }

        int larger = 0;

        if(numOne > numTwo) {
            larger = numOne;
        } else {
            larger = numTwo;
        }

        int commonDivisor = 0;

        for(int i = 1; i <= larger; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                commonDivisor = i;
            }
        }

        return commonDivisor;
    }
}
