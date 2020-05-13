package com.templates.behavioral.command;

import java.util.List;

public class ToggleAllLightsCommand implements Command {
    private List<Light> lights;

    public ToggleAllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::toggle);
    }
}
