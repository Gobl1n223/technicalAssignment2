package com.example.service;

import com.example.xml.Payment;
import com.example.xml.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    Card card = new Card();


    CreditCard creditCard = new CreditCard();

    private Result calculateTaxes(Payment payment){
        float tax = 0F;
        if(payment.getState()) {
            //Теряеться точность расчетов, нужно использовать BigDecimal
            tax = creditCard.getPercent();

            payment.setValue((long) (payment.getValue() / 100F * (1 - tax) * 100F));
        }
        return new Result(creditCard.addMoneyToBalance(payment).getBalance(), tax);
    }

    private Result topUpBalance(Payment payment){
        card.setBalance(payment);
        return new Result(card.getBalance(), 0F);
    }



    public Result pay(Payment payment){
        return switch (payment.getPart()) {
            case 'п' -> topUpBalance(payment);
            case 'к' -> calculateTaxes(payment);
            //допил: кинуть exception
            default -> null;
        };
    }
}
