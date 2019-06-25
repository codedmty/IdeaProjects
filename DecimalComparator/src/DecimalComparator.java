public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {

        numOne = numOne * 1000;
        numTwo = numTwo * 1000;
        int newNumOne = (int) numOne;
        int newNumTwo = (int) numTwo;

        return newNumOne == newNumTwo;

    }

}
