package com.meijindeng.service.impl;

import com.meijindeng.mapper.PaymentMapper1;
import com.meijindeng.pojo.Payment;
import com.meijindeng.service.PaymentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: PaymentServiceImpl1
 * @Author: dengmeijin
 * @Date: 2021/9/7 9:33
 */
@Service
public class PaymentServiceImpl1 implements PaymentService1 {
    @Autowired
    PaymentMapper1 paymentMapper1;

    @Override
    public int create(Payment payment) {
        return paymentMapper1.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentMapper1.queryById(id);
    }
}

