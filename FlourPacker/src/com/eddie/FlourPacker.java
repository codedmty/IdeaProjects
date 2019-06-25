package com.eddie;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (goal % 5 == 0 && goal >= 5) {
            return ((bigCount * 5) + smallCount >= goal);
        } else if (bigCount == 0) {
            return smallCount >= goal;
        } else if((bigCount*5)+smallCount < goal) {
            return false;
        } else {
            return smallCount >= goal % 5;
        }
    }
}

