package com.templates.behavioral.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
        turnOnAllLights.execute();

        Command printAllLights = new PrintAllLightsCommand(mediator);
        printAllLights.execute();
    }
}
