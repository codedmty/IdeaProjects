package com.eddie;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus); // This works as well with the variables values above

        calculateScore(true, 800, 5, 100);

        calculateScore(true,10000,8,200);

        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) { // can write as if (gameOver). Same as gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

            return -1; // -1 is used in programming terms to indicate an error or a value not found


    }

}
