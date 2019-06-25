package com.eddie;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(16004402));
//        int count = 1;
//        while(count != 6) {
//
//            System.out.println("Count value is " + count);
//            count++;
//
//        }
//
//        System.out.println("*************************");
//        //while true is an endless loop, so make sure there is a break
//        //if there is no way to get out it will loop forever
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("*************************");
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue; //goes back to start of the loop
            }             //without processsing the code below

            System.out.println("Even number " + number);
            evenCount++;
            if(evenCount >= 5) {
                break;
            }
        }

        System.out.println(evenCount + " even numbers found.");

    }

    public static boolean isEvenNumber (int number) {
        if (number == 0) {
            return false;
        }

        return (number % 2 == 0);
    }
}
