package com.eddie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arrayForward = new int[] {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrayForward));
        reverse(arrayForward);

    }

    private static void reverse(int[] array) {
        int n = array.length - 1;
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            newArray[n] = array[i];
            n--;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
