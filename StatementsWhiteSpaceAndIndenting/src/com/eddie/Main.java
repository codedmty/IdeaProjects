package com.eddie;

public class Main {

    public static void main(String[] args) {
        //  { statement is here}
        int myVariable = 50;

        myVariable++;

        System.out.println("This is a complete statement, the whole line");

        // Statements do not have to be on one line
        System.out.println("This is " +
                "another" +
                " still more.");
        // same as
        System.out.println("This is another still more.");

        // Can put multiple statments on same line (DON'T DO THIS, BUT POSSIBLE)
        int anotherVariable = 50;
        myVariable++;
        System.out.println("This is still valid");

        // Whitespace is the space between statements to make it more readable.
        // Java doesn't read whitespace, it just removes it.

        // Indentation is used to make code easier to read and to see the logical flow of the code.

    }
}
