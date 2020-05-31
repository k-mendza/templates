package com.templates.behavioral.strategy;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return hasCorrectStartingNumbers(creditCard.getNumber())
                && hasCorrectNumberLength(creditCard.getNumber())
                && this.checkLuhn(creditCard.getNumber());
    }

    private boolean hasCorrectStartingNumbers(String creditCardNumber) {
        return creditCardNumber.startsWith("37")
                || creditCardNumber.startsWith("34");
    }

    private boolean hasCorrectNumberLength(String creditCardNumber) {
        return creditCardNumber.length() == 15;
    }
}
