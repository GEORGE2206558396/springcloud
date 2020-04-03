package com.ljs.springcloud.service;


import com.ljs.springcloud.entities.Payment;


public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
