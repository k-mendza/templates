package com.templates.behavioral.chainofresponsibility;

public class Request {
    private static final double VP_LIMIT = 1500;
    private final RequestType requestType;
    private final double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public boolean forPurchase() {
        return this.requestType == RequestType.PURCHASE;
    }

    public boolean forConference() {
        return this.requestType == RequestType.CONFERENCE;
    }

    public boolean isInVPLimit() {
        return this.amount <= VP_LIMIT;
    }
}
