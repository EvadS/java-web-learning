package com.se.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseInvoiceService  extends InvoiceService{
    @Autowired
    private OrderService orderService;

}
