package com.templates.behavioral.command;

public class ToggleCommand implements Command {
    private Light light;

    ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
