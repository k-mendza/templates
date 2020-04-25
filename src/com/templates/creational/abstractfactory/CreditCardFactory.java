package com.templates.creational.abstractfactory;

import com.templates.creational.abstractfactory.amex.AmexFactory;
import com.templates.creational.abstractfactory.visa.VisaFactory;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
