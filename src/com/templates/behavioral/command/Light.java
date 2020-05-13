package com.templates.behavioral.command;

//receiver
public class Light {

    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
        System.out.println("Light is on");
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
        System.out.println("Light is off");
    }
}
