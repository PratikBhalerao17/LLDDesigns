package org.example.VendingMachine.State;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    final Map<String,Item> items =  new HashMap<>();
    final Map<String,Integer> itemsStock =  new HashMap<>(); // code --> quantity

    public void addItem(String code, String name , int price, int quantity){
        Item item = new Item(code,name,price);
        items.put(code,item);
        itemsStock.put(code,quantity);
    }
    public Item getItem(String code){
        return items.get(code);
    }
    public boolean isItemAvailable(String code){
        if(items.get(code)!= null && itemsStock.get(code)>0){
            return true;
        }
        System.out.println("The item is not found or the item is out of stocks");
        return false;
    }

    public void reduceStock(String code){
        itemsStock.put(code,itemsStock.get(code)-1);
    }

}
