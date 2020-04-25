package com.templates.creational.abstractfactory.amex;

import com.templates.creational.abstractfactory.CardType;
import com.templates.creational.abstractfactory.CreditCard;
import com.templates.creational.abstractfactory.CreditCardFactory;
import com.templates.creational.abstractfactory.Validator;
import com.templates.creational.abstractfactory.amex.card.AmexGoldCreditCard;
import com.templates.creational.abstractfactory.amex.card.AmexPlatinumCreditCard;
import com.templates.creational.abstractfactory.amex.card.AmexSilverCreditCard;
import com.templates.creational.abstractfactory.amex.validator.AmexGoldValidator;
import com.templates.creational.abstractfactory.amex.validator.AmexPlatinumValidator;
import com.templates.creational.abstractfactory.amex.validator.AmexSilverValidator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            case GOLD:
                return new AmexGoldCreditCard();
            case SILVER:
                return new AmexSilverCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new AmexPlatinumValidator();
            case GOLD:
                return new AmexGoldValidator();
            case SILVER:
                return new AmexSilverValidator();
            default:
                return null;
        }
    }
}
