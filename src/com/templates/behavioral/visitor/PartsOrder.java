package com.templates.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {
    private List<AtvPart> partList = new ArrayList<>();

    public void addPart(AtvPart part) {
        partList.add(part);
    }

    public List<AtvPart> getPartList() {
        return Collections.unmodifiableList(partList);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : partList) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
