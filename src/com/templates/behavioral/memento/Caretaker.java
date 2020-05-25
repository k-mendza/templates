package com.templates.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> employeeMementoStack = new Stack<>();

    public void save(Employee employee) {
        employeeMementoStack.push(employee.save());
    }

    public void rollback(Employee employee) {
        employee.rollback(employeeMementoStack.pop());
    }
}
