package com.templates.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        Light bedroomLight = new Light(); // receiver
        Light kitchenLight = new Light(); // receiver
        Switch lightSwitch = new Switch(); // invoker

        Command toggle = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggle);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command lightsOff = new LightsOffCommand(lights);

        lightSwitch.storeAndExecute(lightsOff);
    }
}
