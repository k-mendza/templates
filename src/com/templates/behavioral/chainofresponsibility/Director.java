package com.templates.behavioral.chainofresponsibility;

public class Director extends Handler {

    public Director(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.forConference()) {
            System.out.println("Directors approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
