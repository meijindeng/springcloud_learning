package com.meijindeng.controller;

import com.meijindeng.pojo.CommonResult;
import com.meijindeng.pojo.Payment;
import com.meijindeng.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: PaymentController
 * @Author: dengmeijin
 * @Date: 2021/9/6 11:26
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("*************插入成功**************"+i);
        if(i>0){
            return new CommonResult(200,"插入成功",i);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
}
