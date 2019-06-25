package com.eddie;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(77,true);

        printer.fillUpToner(10);

        printer.printPages(10);

        printer.fillUpToner(0);

        printer.printPages(100);

        printer.printPages(200);

        printer.changeSettings(false);

        printer.fillUpToner(52);

        printer.printPages(200);

        printer.printPages(5);

        printer.changeSettings(true);

        printer.printPages(5);
    }
}
