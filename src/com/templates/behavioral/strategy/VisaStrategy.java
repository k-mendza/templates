package com.templates.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return hasCorrectStartingNumbers(creditCard.getNumber())
                && hasCorrectNumberLength(creditCard.getNumber())
                && this.checkLuhn(creditCard.getNumber());
    }

    private boolean hasCorrectStartingNumbers(String creditCardNumber) {
        return creditCardNumber.startsWith("4");
    }

    private boolean hasCorrectNumberLength(String creditCardNumber) {
        return creditCardNumber.length() == 16;
    }
}
