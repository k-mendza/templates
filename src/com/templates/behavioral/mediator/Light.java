package com.templates.behavioral.mediator;

public class Light {
    private boolean isOn;
    private String location;

    public Light() {}

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }

    public void toggle(){
        isOn = !isOn;
    }

    public void print() {
        System.out.println("Location: " + location + ", isOn: " + isOn);
    }
}
