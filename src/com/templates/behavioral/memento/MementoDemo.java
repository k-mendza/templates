package com.templates.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee john = new Employee("John", "Street 111", "111-222-333");

        caretaker.save(john);

        john.setName("Tony");

        System.out.println(john);
        caretaker.rollback(john);
        System.out.println(john);
    }
}
