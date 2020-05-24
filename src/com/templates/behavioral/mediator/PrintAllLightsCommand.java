package com.templates.behavioral.mediator;

public class PrintAllLightsCommand implements Command {
    private final Mediator instance;

    public PrintAllLightsCommand(Mediator mediator) {
        instance = mediator;
    }

    @Override
    public void execute() {
        instance.printAllLights();
    }
}
