package com.templates.behavioral.state;

public class FanHighState extends State {

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
