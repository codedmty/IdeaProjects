package com.eddie;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Eddie", calculateHighScorePosition(1500));

        displayHighScorePosition("Adriana", calculateHighScorePosition(900));

        displayHighScorePosition("Jason", calculateHighScorePosition(400));

        displayHighScorePosition("Jon Snow", calculateHighScorePosition(50));

        displayHighScorePosition("Lannister", calculateHighScorePosition(1000));

        displayHighScorePosition("Daenerys", calculateHighScorePosition(500));

         displayHighScorePosition("Ned Stark", calculateHighScorePosition(100));

    }


    public static void displayHighScorePosition (String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) { // Do not need to check if playerScore < 1000 after first If statement
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        // Another way to do it other
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }

        return position;

    }


}

