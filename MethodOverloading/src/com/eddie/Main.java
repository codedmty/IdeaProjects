package com.eddie;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Eddie", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(71, 0));
        System.out.println(calcFeetAndInchesToCentimeters(852));

    }

    public static int calculateScore (String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore (int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore () {

        System.out.println("No player name, no player score");
        return 0;

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if (feet >= 0 && inches >= 0 && inches <= 12) {

            return ((feet * 12) + inches) * 2.54;

        }

            return -1;

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if (inches >= 0) {

            double feet = (int) inches / 12;
            inches = inches % 12;

            return calcFeetAndInchesToCentimeters(feet, inches);

        }

            return -1;

    }

}
