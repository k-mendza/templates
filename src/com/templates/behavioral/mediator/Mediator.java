package com.templates.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        lights.stream()
                .filter(Light::isOff)
                .forEach(Light::toggle);
    }

    public void printAllLights() {
        lights.forEach(Light::print);
    }
}
