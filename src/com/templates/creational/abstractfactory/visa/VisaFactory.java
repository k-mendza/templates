package com.templates.creational.abstractfactory.visa;

import com.templates.creational.abstractfactory.CardType;
import com.templates.creational.abstractfactory.CreditCard;
import com.templates.creational.abstractfactory.CreditCardFactory;
import com.templates.creational.abstractfactory.Validator;
import com.templates.creational.abstractfactory.visa.card.VisaGoldCreditCard;
import com.templates.creational.abstractfactory.visa.card.VisaPlatinumCreditCard;
import com.templates.creational.abstractfactory.visa.card.VisaSilverCreditCard;
import com.templates.creational.abstractfactory.visa.validator.VisaGoldValidator;
import com.templates.creational.abstractfactory.visa.validator.VisaPlatinumValidator;
import com.templates.creational.abstractfactory.visa.validator.VisaSilverValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            case GOLD:
                return new VisaGoldCreditCard();
            case SILVER:
                return new VisaSilverCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumValidator();
            case GOLD:
                return new VisaGoldValidator();
            case SILVER:
                return new VisaSilverValidator();
            default:
                return null;
        }
    }
}
