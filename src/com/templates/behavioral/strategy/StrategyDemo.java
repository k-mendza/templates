package com.templates.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("123456789");
        amexCard.setDate("01/2030");
        amexCard.setCVV("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("48907698731213");
        visaCard.setDate("01/2022");
        visaCard.setCVV("321");

        System.out.println("Is visa valid: " + visaCard.isValid());
    }
}
