package com.ygh.demo;

import desginPatter.chainOfResponsibility.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchaseResquest extends Request {

    private double amount;
    private String purpose;
}
