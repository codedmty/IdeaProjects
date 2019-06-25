package com.eddie;

public class Main {

    public static void main(String[] args) {
        // Operators are special symbols that perform specific operations

        // + operator
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        // - operator
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        // * operator
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        // / operator
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        // % (remainder) operator
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 =" + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);

        // increment current count by one
        result++;
        System.out.println("result is now = " + result);

        // subtract one from current count
        result--;
        System.out.println("result is now = " + result);

        // += adds the number after the equal sign to the variable
        result += 2;
        System.out.println("result is now = " + result);
        result *= 10;
        System.out.println("result is now = " + result);
        result -= 10;
        System.out.println("result is now = " + result);
        result /= 10;
        System.out.println("result is now = " + result);

        // = set value, but == is testing whether the value is true/false
        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
        }

        // != to test "is not equal to", opposite of ==
        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        // > greater than, >= greater than or equal to, < less than, <= less than or equal to
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ( (topScore > secondTopScore) && (topScore < 100) )
            System.out.println("Greater than second top score and less than 100!!");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not suppose to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        double numValueOne = 20;
        double numValueTwo = 80;
        double newNumValue = (numValueOne + numValueTwo) * 25;
        double remainderValue = newNumValue % 40;

        System.out.println(newNumValue);
        System.out.println(remainderValue);

        if (remainderValue <= 20) {
            System.out.println("Total was over the limit");
        }

    }
}
