package com.eddie;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Lab");

        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
