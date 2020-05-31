package com.templates.behavioral.visitor;

public class AtvDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Order");
    }
}
