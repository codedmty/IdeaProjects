package com.eddie;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {

            System.out.println("Invalid Value");

        } else {

            int reversed = reverse(number);

            do {
                switch (reversed % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }

                reversed /= 10;

            } while (reversed > 0);

            if (number != reverse(number)) {

                int diff = (number / reverse(number));

                for (int i = 1; i < diff; i *= 10) {
                    System.out.println("Zero");
                }
            }
        }
    }
    
    public static int reverse(int reverseNumber) {

        int newNumber = 0;

        while (reverseNumber != 0) {
            newNumber += reverseNumber % 10;
            newNumber *= 10;
            reverseNumber /= 10;
        }
        newNumber /= 10;
        return newNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            sum += 1;
            number /= 10;
        } while (number > 0);

        return sum;

    }
}
