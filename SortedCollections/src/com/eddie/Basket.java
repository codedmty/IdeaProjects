package com.eddie;

import java.util.*;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;
    private double totalCost;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
        this.totalCost = 0;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket - quantity);
            if (item.getReserved() == 0) {
                list.remove(item);
            }
            return inBasket;
        } else {
            return 0;
        }
    }

    public void checkOut() {
        this.list.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + (list.size() == 1 ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey().getName() + " : price " + item.getKey().getPrice() + ". " + item.getValue() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        this.totalCost = totalCost;
        return s + "Total cost " + String.format("%.2f", totalCost);
    }
}
