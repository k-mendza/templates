package com.templates.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        CEO jeff = new CEO();
        VP crystal = new VP(jeff);
        Director bryan = new Director(crystal);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
