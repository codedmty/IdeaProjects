package com.eddie;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for(String s : stockList.Items().keySet()) {
////            System.out.println(s);
////        }

        System.out.println("********************************************");

        Basket eddiesBasket = new Basket("Eddie");

        addItemToBasket(eddiesBasket, "phone", 35);

        addItemToBasket(eddiesBasket,"juice", 5);

        addItemToBasket(eddiesBasket, "towel", 12);

        System.out.println(eddiesBasket);

        System.out.println(stockList);

        removeItemFromBasket(eddiesBasket,"juice", 5);

        removeItemFromBasket(eddiesBasket, "towel", 6);

        System.out.println(eddiesBasket);

        checkOut(eddiesBasket);

        System.out.println(stockList);
        System.out.println(eddiesBasket);




//        sellItem(eddiesBasket, "car", 1);
//        System.out.println(eddiesBasket);
//
//        sellItem(eddiesBasket, "car", 1);
//        System.out.println(eddiesBasket);
//
//        if(sellItem(eddiesBasket, "car", 1) != 1) {
//            System.out.println("There are no more cars in stock.");
//        }
//        sellItem(eddiesBasket, "spanner", 1);
//        System.out.println(eddiesBasket);
//
//        sellItem(eddiesBasket, "juice", 4);
//        sellItem(eddiesBasket, "cup", 12);
//        sellItem(eddiesBasket, "bread", 1);
//        System.out.println(eddiesBasket);
//
//        System.out.println(stockList);
//
//        temp = new StockItem("pen", 1.12);
//        stockList.Items().get("car").adjustStock(2000);
//        stockList.get("car").adjustStock(-1000);
//        System.out.println(stockList);
//
//        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

    }

    private static void addItemToBasket(Basket basket, String item, int quantity) {
        // retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
        }

        if(quantity != 0 && quantity + stockList.get(item).getReserved() <= stockList.get(item).getQuantityStock()) {
            basket.addToBasket(stockItem, quantity);
            stockList.get(item).setReserved(stockList.get(item).getReserved() + quantity);
        } else {
            System.out.println("There are only " + stockList.get(item).getQuantityStock() + " in stock.");
        }
    }

    private static void removeItemFromBasket(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(quantity <= stockList.get(item).getReserved()) {
            stockList.get(item).setReserved(stockList.get(item).getReserved() - quantity);
            basket.removeFromBasket(stockItem, quantity);
        } else {
            System.out.println("There are only " + stockList.get(item).getReserved() + " in the basket!");
        }
    }

    private static void checkOut(Basket basket) {
        System.out.println("Your total is $" + String.format("%.2f",basket.getTotalCost()) + ". Thank you for your purchase!" );
        stockList.checkOut();
        basket.checkOut();
    }

}
