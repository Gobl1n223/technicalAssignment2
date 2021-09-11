package com.example.service;

import java.time.LocalDate;
import java.util.Date;


public class Month {
    private Date date;

    private Long balance;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long topUpBalance) {
        balance = balance + topUpBalance;
    }

    //инициализация из за отсуствия бд
    public Month() {
        date = java.sql.Date.valueOf(LocalDate.now());
        balance = 0L;
    }
}
