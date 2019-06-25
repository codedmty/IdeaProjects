package com.eddie;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall(15,8,"red");
        Wall wall2 = new Wall(15,8,"red");
        Wall wall3 = new Wall(15,8,"black");
        Wall wall4 = new Wall(12,8,"yellow");
        Door door = new Door("brown", "wood", false);
        Couch theCouch = new Couch("leather", 14, 10, "brownish");
        Lamp theLamp = new Lamp("shade","blue", true);

        Room theRoom = new Room(wall1,wall2,wall3,wall4,door,theCouch,theLamp);

        door.enterExit();

        theRoom.getTheCouch().sitOnCouch();

        theRoom.getTheLamp().turnOn();

        wall1.observeWall();

        wall3.observeWall();

        theLamp.turnOff();

        theCouch.standUp();

        door.enterExit();

    }
}
