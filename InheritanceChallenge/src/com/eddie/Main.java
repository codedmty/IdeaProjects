package com.eddie;

public class Main {

    public static void main(String[] args) {

        Kia niro = new Kia("left-hand",4,4,"Hatchback Sedan", "Niro", true,true);

        niro.steering();

        niro.speed(25);

        niro.changingGears();

        System.out.println(niro.getModel());
        System.out.println(niro.getDoors());
        System.out.println(niro.isHybrid());
        System.out.println(niro.getSteering());

    }
}
