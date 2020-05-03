package com.templates.structural.flyweight;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("iPhone", 333);
        inventorySystem.takeOrder("Sony A3300", 111);
        inventorySystem.takeOrder("Sony A3300", 444);
        inventorySystem.takeOrder("iPhone", 555);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
