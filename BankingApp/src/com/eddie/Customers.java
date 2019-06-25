package com.eddie;

import java.util.ArrayList;

public class Customers {
    private String name;
    public ArrayList<Double> transactionList;

    public Customers(String name, double transaction) {
        this.name = name;
        transactionList = new ArrayList<>();
        this.transactionList.add(transaction);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transaction) {
        transactionList.add(transaction);
    }

}


