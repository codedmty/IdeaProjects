package com.eddie;

public class Couch {
    private String fabric;
    private int width;
    private int depth;
    private String color;

    public Couch(String fabric, int width, int depth, String color) {
        this.fabric = fabric;
        this.width = width;
        this.depth = depth;
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }

    public void sitOnCouch() {
        System.out.println("You sat down on the couch.");
    }

    public void standUp() {
        System.out.println("You stood up.");
    }
}
