package com.eddie;



public class Main {

    public static void main(String[] args) {

        // Welcome Message
        Welcome.Message();

        // Method call to order the burger
        Hamburger hamburger = BuildBurger.BurgerBuilder();


        // Final message to the customer to confirm the order and the price
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println("You ordered the " + hamburger.getName() + ",");
        System.out.println("which has a " + hamburger.getMeat() + ",");
        System.out.println("and a " + hamburger.getBreadRoll() + ".");

        // Printing out the extras if there are any extras
        System.out.println();

        // If the Burger Combo || Hamburger/Healthy Burger
        if(hamburger.getName() == "Burger Combo") {
            System.out.println("Your burger includes the following extras:");
            System.out.println("* tomatoes");
            System.out.println("* onions");
            System.out.println("* cheddar cheese ");
            System.out.println("* bacon");
        } else if (hamburger.getExtra1() != null && hamburger.getExtra2() != null && hamburger.getExtra3() != null && hamburger.getExtra4() != null) {
            System.out.println("You made the following changes to your burger:");
            System.out.println(hamburger.getExtra1() != "" ? "* Add " + hamburger.getExtra1() : "* No tomatoes");
            System.out.println(hamburger.getExtra2() != "" ? "* Add " + hamburger.getExtra2() : "* No onions");
            System.out.println(hamburger.getExtra3() != "" ? "* Add " + hamburger.getExtra3() : "* No cheese");
            System.out.println(hamburger.getExtra4() != "" ? "* Add " + hamburger.getExtra4() : "* No bacon");

            // Print out extras if Healthy Burger
            if(hamburger.getName() == "Healthy Burger") {
                System.out.println(hamburger.getExtra5() != "" ? "* Add " + hamburger.getExtra5() : "* No avocado");
                System.out.println(hamburger.getExtra6() != "" ? "* Add " + hamburger.getExtra6() : "* No extra greens");
            }
        }

            // Checking if they got the combo, if they did, print out the combo extras
            if (hamburger.getName().equals("Burger Combo")) {
                System.out.println();
                System.out.println(hamburger.getExtras());
            }

            // Total price printout
            System.out.println();
            System.out.println("Your total is $" + String.format("%.2f", hamburger.getPrice()));
    }
}
