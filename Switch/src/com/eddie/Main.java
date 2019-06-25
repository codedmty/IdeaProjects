package com.eddie;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        //Switch version of the if/else statement above.
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }


        //Challenge
        char switchChar = ' ';


        switch(switchChar) {

            case 'A':
                System.out.println(switchChar + " was not the correct answer. Try again.");
                break;

            case 'B':
                System.out.println("Sorry, but " + switchChar + " was not the correct answer.");
                break;

            case 'C':
                System.out.println("You got it! " + switchChar + " was the correct answer!!");
                break;

            case 'D':
                System.out.println(switchChar + " wasn't the right answer. Better luck next time.");
                break;

            case 'E':
                System.out.println(switchChar + " definitely wasn't the right answer. Check your notes");
                break;

            default:
                System.out.println("Please select an answer");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }

    }
}
