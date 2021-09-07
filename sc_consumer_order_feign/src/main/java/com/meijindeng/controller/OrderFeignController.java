package com.meijindeng.controller;

import com.meijindeng.pojo.CommonResult;
import com.meijindeng.pojo.Payment;
import com.meijindeng.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: OrderFeignController
 * @Author: dengmeijin
 * @Date: 2021/9/7 15:42
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult result = paymentService.queryById(id);
        return result;
    }
}
