package com.eddie;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //Basic For Loop example
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //Counting up for i
        for(int i=2; i<9; i++) {                                    //Formatting output to 2 decimal places
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));

        }

        System.out.println("******************************");

        //Counting down for i
        for(int i=8; i>1; i--) {                                    //Formatting output to 2 decimal places
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));

        }

        //My solution to Challenge
        for(int i=5, time=0; i<20 && time < 3; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number.");
                    time++;
                }
        }

        //Tim's solution to challenge
        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
              count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    //Method to check if a number is prime.
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        //can use (long) Math.sqrt(n) in place of n/2
        for(int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }



//    //For loop, init means it's going to be initialized once, termination is when we exit (false),
//    // increment (how many times the number increments each loop.
//    for(init; termination; increment) {
//
//    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));

    }
}
