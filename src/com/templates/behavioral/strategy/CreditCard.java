package com.templates.behavioral.strategy;

public class CreditCard {
    private String number;
    private String date;
    private String CVV;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String cvv) {
        this.CVV = cvv;
    }
}
