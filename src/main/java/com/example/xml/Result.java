package com.example.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Result {
    @JacksonXmlProperty
    private Long balance;

    @JacksonXmlProperty
    private Float percent;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public Result(Long balance, Float percent) {
        this.balance = balance;
        this.percent = percent;
    }


}
