package com.templates.creational.abstractfactory.visa.validator;

import com.templates.creational.abstractfactory.CreditCard;
import com.templates.creational.abstractfactory.Validator;

public class VisaPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
