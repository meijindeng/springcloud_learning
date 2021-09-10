package com.meijindeng.controller;

import com.meijindeng.service.OrderHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: OrderHystrixController
 * @Author: dengmeijin
 * @Date: 2021/9/8 10:01
 */
@RestController
@Slf4j
public class OrderHystrixController {
    @Autowired
    private OrderHystrixService orderHystrixService;

    @GetMapping("/consumer/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id){
        return orderHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return orderHystrixService.paymentInfo_TimeOut(id);
    }
}
