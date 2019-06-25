package com.eddie;

public class Kia extends Car {

    private String model;
    boolean hybrid;
    boolean auto;

    public Kia(String steering, int wheels, int doors, String type, String model, boolean hybrid, boolean auto) {
        super(steering, wheels, doors, type);
        this.model = model;
        this.hybrid = hybrid;
        this.auto = auto;
    }

    public String getModel() {
        return model;
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public void changingGears() {
        if(this.auto == true) {
            System.out.println("This model of Kia changes gears automatically!");
        } else {
            System.out.println("Make sure to shift!");
        }
    }

}
