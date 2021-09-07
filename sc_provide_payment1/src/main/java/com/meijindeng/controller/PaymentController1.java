package com.meijindeng.controller;

import com.meijindeng.pojo.CommonResult;
import com.meijindeng.pojo.Payment;
import com.meijindeng.service.PaymentService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: PaymentController1
 * @Author: dengmeijin
 * @Date: 2021/9/7 9:31
 */
@RestController
@Slf4j
public class PaymentController1 {
    @Autowired
    private PaymentService1 paymentService1;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService1.create(payment);
        log.info("*************插入成功**************"+i);
        if(i>0){
            return new CommonResult(200,"插入成功1",i);
        }else {
            return new CommonResult(444,"插入失败1",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService1.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功1",payment);
        }else{
            return new CommonResult(444,"查询失败1",null);
        }
    }
}
