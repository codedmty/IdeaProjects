package com.challenge;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for(int i=0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int sum = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
           return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
