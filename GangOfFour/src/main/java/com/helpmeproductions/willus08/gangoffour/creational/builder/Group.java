package com.helpmeproductions.willus08.gangoffour.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getPrice(){
        float cost = 0.0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){

        for (Item item : items){
            System.out.println("Item: " + item.name());
        }
    }
}
