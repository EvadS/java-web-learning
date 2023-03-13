package com.se.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class ContactService extends AbstractUpdateService{
    @Autowired
    private OrderService orderService;

    @Override
    public Class getDtoClass() {
        return null;
    }

    @Override
    public Object find(BigInteger id) {
        return null;
    }
}
