package com.eddie;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMin = -2_147_483_648;
        int myMax = 2_147_483_647;
        int myTotal = (myMin/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte ) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 30000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 100L;

        // challenge
        byte cByte = 10;
        short cShort = 20;
        int cInteger = 50;
        long cLong = 50_000L  + 10 * (cByte + cShort + cInteger);

        System.out.println("cByte = " + cByte);
        System.out.println("cShort = " + cShort);
        System.out.println("cInteger = " + cInteger);
        System.out.println("cLong = " + cLong);

    }

}
