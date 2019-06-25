package com.eddie;

public class Wall {
    private double width;
    private double height;
    private String color;

    public Wall(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void observeWall(){
        System.out.println("You looked at the wall. The wall is " + this.color + ".");
    }

}
