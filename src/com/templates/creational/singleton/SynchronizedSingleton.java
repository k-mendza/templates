package com.templates.creational.singleton;

public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance = null;

    private SynchronizedSingleton(){
        if (instance != null) {
            throw new RuntimeException("Prohibited constructor coll in singleton class");
        }
    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
