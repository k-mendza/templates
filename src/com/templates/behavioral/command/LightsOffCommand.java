package com.templates.behavioral.command;

import java.util.List;

public class LightsOffCommand implements Command {
    private List<Light> lights;

    public LightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::turnOff);
    }
}
