package com.eddie;

public class Lamp {
    private String type;
    private String color;
    private boolean led;

    public Lamp(String type, String color, boolean led) {
        this.type = type;
        this.color = color;
        this.led = led;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public boolean isLed() {
        return led;
    }

    public void turnOn() {
        System.out.println("You turned the lamp on.");
    }

    public void turnOff() {
        System.out.println("You turned the lamp off.");
    }

}
