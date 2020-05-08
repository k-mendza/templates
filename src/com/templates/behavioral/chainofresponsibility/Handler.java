package com.templates.behavioral.chainofresponsibility;

public abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest(Request request);
}
