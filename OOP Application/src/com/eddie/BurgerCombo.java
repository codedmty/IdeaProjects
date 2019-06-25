package com.eddie;

public class BurgerCombo extends Hamburger {
    private String drink;
    private String chips;

    public BurgerCombo() {
        super("Burger Combo", "whole wheat bun", "1/2lb patty", 7.50);
        super.setExtra1("tomato");
        super.setExtra2("onion");
        super.setExtra3("cheddar cheese");
        super.setExtra4("bacon");
        this.drink = "Coca-Cola";
        this.chips = "Lays Potato Chips";
    }

    @Override
    public String getExtras() {
        return "This combo also includes a " + this.drink + "\nand " + this.chips + ".";
    }
}
