package com.example.service;

import com.example.xml.Payment;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private Long balance;

    private List<Payment> paymentsHistory;

    private String name;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Payment payment) {
        balance = balance + payment.getValue();
        paymentsHistory.add(payment);
    }

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


    //инициализация из за отсуствия бд
    public Card() {
        balance = 0L;
        this.paymentsHistory = new ArrayList<>();
        this.name = "";
    }
}
