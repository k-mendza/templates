package com.templates.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));
        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while (menuComponentIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentIterator.next();
            stringBuilder.append(menuComponent.toString());
        }
        return  stringBuilder.toString();
    }
}
