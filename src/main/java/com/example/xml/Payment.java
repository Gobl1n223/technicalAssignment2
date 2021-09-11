package com.example.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

@JacksonXmlRootElement
public class Payment {

    @JacksonXmlProperty
    private String name;

    @JacksonXmlProperty
    private Integer number;

    @JacksonXmlProperty
    private Date supplyDate;

    @JacksonXmlProperty
    private Boolean state;

    @JacksonXmlProperty
    private Character part;

    @JacksonXmlProperty
    private Long value;

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Character getPart() {
        return part;
    }

    public void setPart(Character part) {
        this.part = part;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Payment() {}

    public Payment(String name, Integer number, Date supplyDate, Boolean state, Character part, Long value) {
        this.name = name;
        this.number = number;
        this.supplyDate = supplyDate;
        this.state = state;
        this.part = part;
        this.value = value;
    }

}
