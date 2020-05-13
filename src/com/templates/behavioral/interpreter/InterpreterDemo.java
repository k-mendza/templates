package com.templates.behavioral.interpreter;


public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        Expression lions = new TerminalExpression("Lions");
        Expression tigers = new TerminalExpression("Tigers");
        Expression bears = new TerminalExpression("Bears");

        Expression tigersAndBears = new AndExpression(tigers, bears);
        Expression lionsOrAlteration = new OrExpression(lions, tigersAndBears);

        return new AndExpression(bears, lionsOrAlteration);
    }

    public static void main(String[] args) {
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
