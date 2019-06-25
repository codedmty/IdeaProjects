package com.eddie;

public class Door {
    private String color;
    private String material;
    boolean inRoom;

    public Door(String color, String material, boolean inRoom) {
        this.color = color;
        this.material = material;
        this.inRoom = inRoom;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isInRoom() {
        return inRoom;
    }

    public void enterExit(){
        openDoor();
    }

    private void openDoor() {
        if(!inRoom) {
            System.out.println("You entered the room.");
            inRoom = true;
        } else {
            System.out.println("You left the room.");
            inRoom = false;
        }
    }
}
