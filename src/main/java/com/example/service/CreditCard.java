package com.example.service;

import com.example.xml.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.*;


public class CreditCard {

    private List<Payment> paymentsHistory;

    private String name;

    private List<Month> month;

    private Float percent;


    public List<Payment> getPaymentsHistory() {
        return paymentsHistory;
    }

    public void setPaymentsHistory(Payment payment) {
        paymentsHistory.add(payment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(List<Month> month) {
        this.month = month;
    }

    public List<Month> getMonth() {
        return month;
    }


    //Как то так
    public Month addMoneyToBalance(Payment payment){
        for (Month month1 :
                month) {
            if(month1.getDate().getMonth() == payment.getSupplyDate().getMonth()
            &  month1.getDate().getYear() == payment.getSupplyDate().getYear()){
                month1.setBalance(payment.getValue());
                paymentsHistory.add(payment);
                return month1;
            }
        }
        //допил: кинуть exception
        return null;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }



    //инициализация из за отсуствия бд
    public CreditCard() {
        this.percent = 0.13F;
        this.month = new ArrayList<>();
        this.month.add(new Month());
        this.paymentsHistory = new ArrayList<>();
        this.name = name = "";
    }
}
