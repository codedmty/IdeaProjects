package com.eddie;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Door theDoor;
    private Couch theCouch;
    private Lamp theLamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Door theDoor, Couch theCouch, Lamp theLamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.theDoor = theDoor;
        this.theCouch = theCouch;
        this.theLamp = theLamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Lamp getTheLamp() {
        return theLamp;
    }

}
