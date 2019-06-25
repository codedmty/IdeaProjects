package com.eddie;

public class HealthyBurger extends Hamburger {
    private String extra5;
    private String extra6;

    public HealthyBurger() {
        super("Healthy Burger", "brown rye roll", "veggie patty", 5.25);
    }

    public String getExtra5() {
        return extra5;
    }


    public String getExtra6() {
        return extra6;
    }

    @Override
    public void setExtra5(String extra5) {
        this.extra5 = extra5;
    }

    @Override
    public void setExtra6(String extra6) {
        this.extra6 = extra6;
    }
}
