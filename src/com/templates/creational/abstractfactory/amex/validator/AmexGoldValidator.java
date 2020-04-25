package com.templates.creational.abstractfactory.amex.validator;

import com.templates.creational.abstractfactory.CreditCard;
import com.templates.creational.abstractfactory.Validator;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
