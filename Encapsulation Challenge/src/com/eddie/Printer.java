package com.eddie;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if(tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = 0;

        this.duplex = duplex;
    }

    private int getTonerLevel() {
        return tonerLevel;
    }

    private void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }

    private void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public void fillUpToner(int tonerAdded) {
        if(tonerAdded >= 100) {
            setTonerLevel(100);
            System.out.println("The new toner level is " + this.tonerLevel + ".");
        } else if (tonerAdded < 0) {
            setTonerLevel(this.tonerLevel);
            System.out.println("You didn't add any toner");
        } else if(this.tonerLevel + tonerAdded > 100) {
            setTonerLevel(100);
            System.out.println("The new toner level is " + this.tonerLevel + ". But you overfilled it!");
        } else {
            setTonerLevel(this.tonerLevel += tonerAdded);
            System.out.println("The new toner level is " + this.tonerLevel + ".");
        }
    }

    public void printPages(int pagesToPrint) {
        if(isDuplex()) {
            pagesToPrint = pagesToPrint / 2 + (pagesToPrint % 2);
            System.out.println("Printing in Duplex Mode.");
        }

        if(pagesToPrint / 4 > getTonerLevel()) {
            System.out.println("You need more toner before you can print that many pages");
        } else {
            setPagesPrinted(this.pagesPrinted += pagesToPrint);
            setTonerLevel(this.tonerLevel - (pagesToPrint / 4));
            System.out.println("You printed " + pagesToPrint + " pages.");
            System.out.println("The new toner level is " + getTonerLevel());
            System.out.println("The printer has printed a total of " + getPagesPrinted() + " pages.");
        }

    }

    public void changeSettings(boolean newSetting) {
        setDuplex(newSetting);
    }

}
