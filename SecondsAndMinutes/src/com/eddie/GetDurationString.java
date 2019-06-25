package com.eddie;

public class GetDurationString {
    //Constant variable CANNOT BE CHANGED
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        String hours = (minutes / 60) < 10 ? "0" + (minutes / 60) : "" + (minutes / 60);

        String totalMinutes = (minutes % 60) < 10 ? "0" + (minutes % 60) : "" + (minutes % 60);

        String newSeconds = seconds < 10 ? "0" + seconds : "" + seconds;

        return (hours + "h " + totalMinutes + "m " + newSeconds + "s");
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
