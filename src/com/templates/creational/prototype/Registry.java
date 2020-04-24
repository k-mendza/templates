package com.templates.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private final Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem (String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours 43 minutes");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(19.99);
        book.setPageNumber(327);
        items.put("Book", book);
    }
}
