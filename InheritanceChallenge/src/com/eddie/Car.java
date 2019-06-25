package com.eddie;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private String type;

    public Car(String steering, int wheels, int doors, String type) {
        super(steering);
        this.wheels = wheels;
        this.doors = doors;
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getType() {
        return type;
    }

    public void speed(int speed) {
        System.out.println("The car is moving " + speed + "mph.");
    }

}
