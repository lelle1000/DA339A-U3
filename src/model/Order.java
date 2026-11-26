package model;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Items> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void additem(Items item) {
        if (item != null) {
            items.add(item);
        }
    }

    public double calculateCost() {
        double totalCost = 0.0;

        for(Items item : items) {
            totalCost += item.calculatePrice();
        }

        return totalCost;
    }

    public String[] getOrderItemsAsStrings() {
        String[] itemsArray = new String[items.size()];

        for(int i = 0; i < items.size(); i++) {
            itemsArray[i] = items.get(i).toString();
        }

        return itemsArray;
    }
}
