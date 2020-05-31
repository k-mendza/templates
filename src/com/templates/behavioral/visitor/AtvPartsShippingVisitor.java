package com.templates.behavioral.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fenders are light and cheap to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oils are hazardous and expensive to ship");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        List<AtvPart> parts = partsOrder.getPartList();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
