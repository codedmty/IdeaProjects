package com.eddie;

import java.util.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public int checkOut() {
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            if(stockItem.getReserved() > 0) {
                sellStock(stockItem.getName(), stockItem.getReserved());
            }
        }
        return 0;
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nStock List\n");
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            stringBuilder.append(stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ");
            stringBuilder.append(String.format("%.2f",itemValue) + "\n");
            totalCost += itemValue;
        }

        stringBuilder.append("Total stock value ").append(totalCost);
        return stringBuilder.toString();
    }
}
