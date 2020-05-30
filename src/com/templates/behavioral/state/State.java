package com.templates.behavioral.state;

public abstract class State {
    protected Fan fan;

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here");
    }
}
