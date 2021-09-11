package com.example.controller;

import com.example.service.Month;
import com.example.service.PaymentService;
import com.example.xml.Payment;
import com.example.xml.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


    /*

    XML

<Payment>
<name>MyName</name>
<number>1234</number>
<supplyDate>2021-09-23T18:21</supplyDate>
<state>true</state>
<part>к</part>
<value>4310</value>
</Payment>

     */



@RestController
public class testController {


    @Autowired
    private PaymentService paymentService;


    @PostMapping(produces= MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Result> testXML(@RequestBody Payment payment) {


        Result result = paymentService.pay(payment);


        return new ResponseEntity<Result>(result, HttpStatus.ACCEPTED);
    }





}
