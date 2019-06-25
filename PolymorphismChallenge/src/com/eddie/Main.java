package com.eddie;

class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private int doors;
    private String model;

    public Car(int cylinders, int doors, String model) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.doors = doors;
        this.model = model;
    }

    public String startEngine() {
        return "You started the engine!";
    }

    public String accelerate() {
        return "You are accelerating!";
    }

    public String brake() {
        return "You are braking!";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }
}

class Niro extends Car {
    public Niro() {
        super(4,4,"Niro");
    }

    @Override
    public String startEngine() {
        return "You started the " + getModel() + "'s engine!";
    }

    @Override
    public String accelerate() {
        return "The " + getModel() + " is accelerating!";
    }

    @Override
    public String brake() {
        return "The " + getModel() + " is braking!";
    }
}

class Swift extends Car {
    public Swift() {
        super(4,4,"Swift");
    }

    @Override
    public String startEngine() {
        return "You started the " + getModel() + "'s engine!";
    }

    @Override
    public String accelerate() {
        return "The " + getModel() + " is accelerating!";
    }

    @Override
    public String brake() {
        return "The " + getModel() + " is braking!";
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super(12, 4, "Ferrari");
    }

    @Override
    public String startEngine() {
        return "You started the " + getModel() + "'s engine!";
    }

    @Override
    public String accelerate() {
        return "The " + getModel() + " is accelerating!";
    }

    @Override
    public String brake() {
        return "The " + getModel() + " is braking!";
    }

}

class BoringCar extends Car {
    public BoringCar(){
        super(4,4,"Boring Car");
    }
}

public class Main {

    public static void main(String[] args) {

        for(int i=1; i < 10; i++) {
            Car car = randomCarGenerator();
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
            System.out.println();
        }

    }

    public static Car randomCarGenerator(){
        int randomNumber = (int) (Math.random() * 4) + 1;

        switch(randomNumber) {
            case 1:
                return new Niro();
            case 2:
                return new Swift();
            case 3:
                return new Ferrari();
            case 4:
                return new BoringCar();
        }

        return null;
    }

}
