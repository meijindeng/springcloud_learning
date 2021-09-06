package com.meijindeng.service.impl;

import com.meijindeng.mapper.PaymentMapper;
import com.meijindeng.pojo.Payment;
import com.meijindeng.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: PaymentServiceImpl
 * @Author: dengmeijin
 * @Date: 2021/9/6 11:35
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentMapper.queryById(id);
    }
}
