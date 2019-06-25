package com.eddie;

public class Main {

    public static void main(String[] args) {

        NumberToWords.numberToWords(0);

        System.out.println("***********************");

        NumberToWords.numberToWords(123);

        System.out.println("***********************");

        NumberToWords.numberToWords(1010);

        System.out.println("***********************");

        NumberToWords.numberToWords(1000);

        System.out.println("***********************");

        NumberToWords.numberToWords(-12);

        System.out.println("***********************");

        System.out.println(NumberToWords.getDigitCount(0));

        System.out.println("***********************");

        System.out.println(NumberToWords.getDigitCount(123));

        System.out.println("***********************");

        System.out.println(NumberToWords.getDigitCount(-12));

        System.out.println("***********************");

        System.out.println(NumberToWords.getDigitCount(5200));
    }
}
