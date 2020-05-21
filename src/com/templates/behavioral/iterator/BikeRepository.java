package com.templates.behavioral.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] enlargedArray = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, enlargedArray, 0, bikes.length);
            bikes = enlargedArray;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
