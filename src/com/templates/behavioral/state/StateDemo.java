package com.templates.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        for (int i = 0;i < 3;i++) {
            fan.pullChain();
            System.out.println(fan);
        }
    }
}
