package com.templates.behavioral.chainofresponsibility;

public class VP extends Handler {

    public VP(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(Request request) {
        if (isPurchaseBelowLimit(request)) {
            System.out.println("VPs can approve purchases below 1500");
        } else {
            successor.handleRequest(request);
        }
    }

    private boolean isPurchaseBelowLimit(Request request) {
        return request.forPurchase() && request.isInVPLimit();
    }
}
