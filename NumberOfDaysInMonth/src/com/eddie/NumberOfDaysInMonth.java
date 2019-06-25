package com.eddie;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){

        //Checking year is valid
        if (year < 1 || year > 9999) {

            return false;

            //Step 1
        } else if (year % 4 == 0) {

            //Step 2
            if (year % 100 == 0) {

                //Step 3
                if (year % 400 == 0) {

                    return true;

                } else {

                    return false;

                }

            } else {

                return true;
            }

        } else {

            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        isLeapYear(year);
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else if(isLeapYear(year) && month == 2) {
            return 29;
        } else if (!isLeapYear(year) && month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }

    }
}
