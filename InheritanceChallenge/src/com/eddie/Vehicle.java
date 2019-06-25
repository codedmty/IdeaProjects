package com.eddie;

public class Vehicle {
    private String steering;

    public Vehicle(String steering) {
        this.steering = steering;
    }

    public String getSteering() {
        return steering;
    }

    public void steering() {
        System.out.println("This vehicle's steering wheel is on the " + steering + " side.");
    }

}
