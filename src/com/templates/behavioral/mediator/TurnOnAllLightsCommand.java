package com.templates.behavioral.mediator;

public class TurnOnAllLightsCommand implements Command {
    private final Mediator instance;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.instance = mediator;
    }

    @Override
    public void execute() {
        this.instance.turnOnAllLights();
    }
}
