package com.eddie;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }

        private static int sumDigits(int number) {

            if(number < 10) {
                return -1;
            }

            int sum = 0;

            // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

            while (number > 0) {
                // extract the least significant digit
                int digit = number % 10;
                sum += digit;

                // drop the least significant digit
                number  /= 10; // number = number / 10
            }

            return sum;
        }
}
