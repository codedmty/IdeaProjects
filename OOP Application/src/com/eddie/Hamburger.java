package com.eddie;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private String extra1;
    private String extra2;
    private String extra3;
    private String extra4;
    private String extra5;
    private String extra6;
    private double price;


    public Hamburger() {
        this.name = "Basic Burger";
        this.breadRoll = "whole wheat bun";
        this.meat = "1/4lb patty";
        this.price = 4.25;
    }

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    public String getExtra4() {
        return extra4;
    }

    public void setExtra4(String extra4) {
        this.extra4 = extra4;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double extra) {
        this.price += extra;
    }

    public String getBreadRoll() {
        return breadRoll;
    }


    public String getMeat() {
        return meat;
    }


    public String getName() {
        return name;
    }


    public String getExtras(){
        return null;
    }

    public String getExtra5() {
        return extra5;
    }

    public String getExtra6() {
        return extra6;
    }

    public void setExtra5(String extra5) {
        this.extra5 = extra5;
    }

    public void setExtra6(String extra6) {
        this.extra6 = extra6;
    }

}
