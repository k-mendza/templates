package com.templates.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Item> itemMap = new HashMap<>();

    public Item lookup(String itemName) {
        if (!itemMap.containsKey(itemName)) {
            itemMap.put(itemName, new Item(itemName));
        }
        return itemMap.get(itemName);
    }

    public int totalItemsMade() {
        return itemMap.size();
    }
}
